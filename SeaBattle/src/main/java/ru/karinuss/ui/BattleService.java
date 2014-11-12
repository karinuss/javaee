package ru.karinuss.ui;

import javax.servlet.annotation.WebServlet;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * Created by karina on 11.11.14.
 */
@ApplicationPath("/battle")
@Path("/Simple")
public class BattleService extends Application {
    
    @GET
    @Path("/step")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg Fire(@QueryParam("x") @NotNull Integer x,
                                 @QueryParam("y") @NotNull Integer y) {

        // todo
        // получить ход компутера, запросить попали-не попали - вернуть оба - и наш результат и компутера
        return new BattleServiceMsg("ok");
    }

    @GET
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg NewGame() {
        // todo
        // вернуть две новые карты для отрисовки
        return new BattleServiceMsg("new game created");
    }

}
