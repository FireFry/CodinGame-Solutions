import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The code below will read all the game information for you.
 * On each game turn, information will be available on the standard input, you will be sent:
 * -> the total number of visible enemies
 * -> for each enemy, its name and distance from you
 * The system will wait for you to write an enemy name on the standard output.
 * Once you have designated a target:
 * -> the cannon will shoot
 * -> the enemies will move
 * -> new info will be available for you to read on the standard input.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int count = in.nextInt(); // The number of current enemy ships within range
            in.nextLine();
            if (count == 0) {
                continue;
            }
            int minDist = Integer.MAX_VALUE;
            String closest = null;
            for (int i = 0; i < count; i++) {
                String enemy = in.next(); // The name of this enemy
                int dist = in.nextInt(); // The distance to your cannon of this enemy
                if (dist < minDist) {
                    minDist = dist;
                    closest = enemy;
                }
                in.nextLine();
            }

            System.out.println(closest);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }
}
