package megamek.server.victory;

import java.util.ArrayList;

import megamek.common.Report;

public interface IResult {
    /**
     * @return true if the game is about to end since someone has completed
     *         the victory conditions
     */
    boolean victory();

    /**
     * @return player victory level 0.0(total loss) to 1.0 (total victory)
     */
    double getPlayerScore(int id);

    /**
     * list players
     */
    int[] getPlayers();

    /**
     * list team scores all teams which are not listed, can be assumed to be
     * at 0.0
     */
    double getTeamScore(int id);

    /**
     * list teams
     */
    int[] getTeams();

    /**
     * @return true if this is a winning team id (draw == win in this case)
     */
    boolean isWinningTeam(int id);

    /**
     * @return true if this is a winning player id (draw == win in this
     *         case)
     */
    boolean isWinningPlayer(int id);

    /**
     * @return arrayList of reports generated by the victory checking.
     *         Usually empty when no victory should never be null might
     *         contain reports about victoryconditions which are about to be
     *         filled or are time triggered
     */
    ArrayList<Report> getReports();

    /**
     * @return id of the winning team, Player.TEAM_NONE if it's a draw
     */
    int getWinningTeam();

    /**
     * @return id of the winning player, Player.TEAM_NONE if it's a draw
     */
    int getWinningPlayer();

    /**
     * @return if this is a draw
     */
    boolean isDraw();
}
