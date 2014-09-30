import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Player {

    def main(args: Array[String]) {
        val n = readInt // the number of points used to draw the surface of Mars.
        for (i <- 0 until n) {
            // land_x: X coordinate of a surface point. (0 to 6999)
            // land_y: Y coordinate of a surface point. By linking all the points together in a 
sequential fashion, you form the surface of Mars.
            val Array(land_x, land_y) = for (i <- readLine split " ") yield i.toInt
        }

        // game loop
        while (true) {
            // hs: the horizontal speed (in m/s), can be negative.
            // vs: the vertical speed (in m/s), can be negative.
            // f: the quantity of remaining fuel in liters.
            // r: the rotation angle in degrees (-90 to 90).
            // p: the thrust power (0 to 4).
            val Array(x, y, hs, vs, f, r, p) = for (i <- readLine split " ") yield i.toInt
            
            // Write an action using println
            // To debug: Console.err.println("Debug messages...")
            
            println(if (y > 2000) "0 2" else "0 4") // R P. R is the desired rotation angle. P 
is the desired thrust power.
        }
    }
}
