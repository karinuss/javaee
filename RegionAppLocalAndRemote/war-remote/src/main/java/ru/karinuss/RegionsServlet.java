package ru.karinuss;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
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
@WebServlet(name = "RegionsServletRemote", urlPatterns = { "/RegionsRemote" })
public class RegionsServlet extends HttpServlet {

    private final String RegionInterface_JndiName = "java:global/region-app-1.0-SNAPSHOT/region-beans-remote-1.0-SNAPSHOT/RegionsBean!ru.karinuss.RegionInterfaceRemote";

    /* wildfly 8.1 c ejb аннотацией тоже работает */
    //@EJB
    /* wildfly 8.1 и c resource аннотацией тоже работает */
    //@Resource(mappedName = "java:global/region-app-1.0-SNAPSHOT/region-beans-remote-1.0-SNAPSHOT/RegionsBean!ru.karinuss.RegionInterfaceRemote")
    private RegionInterfaceRemote regionsInterface;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String regionName = req.getParameter("region");

      List<Region> regionList;

      /* получение regionsInterface через context-lookup*/
      if(regionsInterface == null) {
          try {
              regionsInterface = (RegionInterfaceRemote) new InitialContext().lookup(RegionInterface_JndiName);
          } catch (NamingException ex) {
              throw new ServletException("Error! JNDI name is not valid!");
          }
      }

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
