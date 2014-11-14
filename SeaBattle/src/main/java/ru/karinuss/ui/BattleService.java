package ru.karinuss.ui;

import javax.servlet.annotation.WebServlet;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/* Protocol REST<->Servlet(JSON)
* #newgame
* create new maps
    newgame/ { msg: "message",  maps: { user: [], computer: [] } }
* get maps
    getmaps/ { maps: { user: [], computer: [] }}
* #fire
*  user step
     fire?x=10&y=20 { msg: "message", coord: { x: 10, y: 20, hit: 0 } }
*  computer step
    nextstep/ { msg: "message", coord: { x: 10, y: 34,  hit: 1 } }
*/
@ApplicationPath("/battle")
@Path("/Simple")
public class BattleService extends Application {
    
    @GET
    @Path("/fire")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg fire(@QueryParam("x") @NotNull Integer x,
                                 @QueryParam("y") @NotNull Integer y) {

        // todo
        // получить ход компутера, запросить попали-не попали - вернуть оба - и наш результат и компутера
        return new BattleServiceMsg("ok");
    }

    @GET
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg newGame() {
        // todo
        return new BattleServiceMsg("new game created");
    }


    @GET
    @Path("/getmaps")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg getMaps() {
        // todo
        // вернуть две новые карты для отрисовки
        return new BattleServiceMsg("new game created");
    }

    @GET
    @Path("/nextstep")
    @Produces(MediaType.APPLICATION_JSON)
    public BattleServiceMsg nextStep() {
        // todo
        // вернуть шаг компутера
        return new BattleServiceMsg("new game created");
    }
}
