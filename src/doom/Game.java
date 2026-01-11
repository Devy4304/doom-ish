package doom;

public class Game {
    /*
        COMMANDS:
        MOVE, SHOOT, USE, CHEATS, QUIT

        MOVE:
        Moves the player in the specified direction.

        SHOOT:
        Shoots the selected enemy that is within a 3-cell radius of the player.

        USE:
        Interacts with a door / button within a 1-cell radius of the player.

        CHEATS:
        Opens a menu with options for cheats to be enabled.

        QUIT:
        Quits the game. (May or may not implement)
     */

    // Map tiles
    public static final char SOLID = '#';
    public static final char EXIT = '$';
    public static final char SPAWN = '^';
    public static final char CLOSED_DOOR = '=';
    public static final char OPEN_DOOR = '-';

    // Entities
    public static final char PLAYER = '‼';
    public static final char ZOMBIE = '€';
    public static final char IMP = '⁂';

    public static boolean isPassable(char tile) {
        return !(tile == SOLID || tile == EXIT || tile == SPAWN || tile == CLOSED_DOOR || tile == ZOMBIE || tile == IMP);
    }


}
