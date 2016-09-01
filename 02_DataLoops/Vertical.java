/*
 * Vertical
 *
 * This program solves a well-known physics formula for an object thrown vertically.
 * For an initial speed u, the displacement s after a time t has elapsed is given by
 * the formula:
 *
 *      s = u t - g t^2 / 2
 *
 * where g is gravitational acceleration, and air resistance is ignored. 
 *
 * The steps involved are as follows:
 * 1. Set values of g, u, and t
 * 2. Compute the value of s using the formula above
 * 3. Print the value of s
 *
 */
public class Vertical { 
    public static void main(String[] args) {
        // 1. Assign values of g, u, and t
        double g = 9.8; // acceleration due to gravity
        double s; // vertical displacement
        double t; // time
        double u; // initial velocity

        t = 5;
        u = 50;

        // 2. Compute value of s
        s = u*t - g*t*t/2;

        // 3. Print the value of s
        System.out.println("s: " + s + " meters");
    }
}
