package ru.karinuss;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by karina on 21.10.14.
 */
@WebServlet(name = "RegionsServlet", urlPatterns = { "/Regions" }, loadOnStartup = 1)
public class RegionsServlet extends HttpServlet {

    @EJB
    private RegionInterface regionsInterface;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String regionName = req.getParameter("region");

        if(regionName != null) {
            if (!regionName.isEmpty()) {
                regionsInterface.addRegion(new Region(regionName));
            }
        }

        List<Region> regionList = regionsInterface.getRegions();
        req.setAttribute("regions", regionList);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
