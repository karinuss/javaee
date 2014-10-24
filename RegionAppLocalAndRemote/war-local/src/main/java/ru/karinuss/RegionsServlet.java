package ru.karinuss;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.Exception;
import java.lang.NullPointerException;
import java.util.List;

/**
 * Created by karina on 21.10.14.
 */
@WebServlet(name = "RegionsServletLocal", urlPatterns = { "/RegionsLocal" })
public class RegionsServlet extends HttpServlet {

    /* wildfly 8.1 и c @Resource  аннотацией тоже работает(проверено только на remote bean)
    * "For Java EE applications the recommended way to lookup a JNDI entry is to use @Resource injection:"
    *  https://docs.jboss.org/author/display/WFLY8/Local+JNDI+Reference (c)
    */

    @EJB
    private RegionInterfaceLocal regionsInterface;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String regionName = req.getParameter("region");
        List<Region> regionList;

        try {

            if (regionName != null) {
                if (!regionName.isEmpty()) {
                    regionsInterface.addRegion(new Region(regionName));
                }
            }

            regionList = regionsInterface.getRegions();
        } catch (NullPointerException ex) {
            throw new ServletException("Error! Bean is Null!");
        }

        req.setAttribute("regions", regionList);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
