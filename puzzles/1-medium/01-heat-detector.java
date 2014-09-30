import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        in.nextLine();
        int N = in.nextInt(); // maximum number of turns before game over.
        in.nextLine();
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        in.nextLine();
        
        int xl = 0;
        int yt = 0;
        int xr = W;
        int yb = H;

        // game loop
        while (true) {
            String BOMB_DIR = in.next(); // the direction of the bombs from batman's current 
location (U, UR, R, DR, D, DL, L or UL)
            in.nextLine();

            if (BOMB_DIR.contains("L")) {
                xr = X0;
            }
            if (BOMB_DIR.contains("R")) {
                xl = X0 + 1;
            }
            if (BOMB_DIR.contains("U")) {
                yb = Y0;
            }
            if (BOMB_DIR.contains("D")) {
                yt = Y0 + 1;
            }
            
            X0 = (xl + xr) / 2;
            Y0 = (yt + yb) / 2;
            System.out.println(X0 + " " + Y0);
        }
    }
}
