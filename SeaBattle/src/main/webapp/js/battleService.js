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
* */
$(function () {

    $("#fire").click(function () {
        alert("tux");
    })

    $("#newgame").click(function () {
        alert("new game");
    })

})