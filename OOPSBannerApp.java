/**
 * OOPSBannerApp UC1 & UC2 - Banner Display Application
 *
 * This class demonstrates two user stories:
 *
 * UC1: Simple output
 * - Prints the string "OOPS" to the console using a single print statement.
 *
 * UC2: Banner output
 * - Prints a large ASCII-art banner of the letters O, O, P, S built from
 *   asterisks (*) and spaces. The banner uses individual `System.out.println()`
 *   calls for each of the 7 lines that make up the characters. Each character
 *   is represented in a 7-line format and 9 characters wide.
 *
 * Key concepts: ASCII art, string concatenation, multiple print statements.
 *
 * @author Akshat Tiwari
 * @version 2.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC1: simple output
        // Print the literal message as in the first user story.
        System.out.println("OOPS");

        // Render OOPS as a 7-line banner using '*' and spaces.
        // Each character is 7 lines tall and 9 characters wide.
        System.out.println("  *****  " + " " + "  *****  " + " " + "*******  " + " " + "  *****  ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*      * " + " " + " *     * ");
        System.out.println("*       *" + " " + "*       *" + " " + "*      * " + " " + "*        ");
        System.out.println("*       *" + " " + "*       *" + " " + "*******  " + " " + "  ****   ");
        System.out.println("*       *" + " " + "*       *" + " " + "*        " + " " + "       * ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*        " + " " + " *     * ");
        System.out.println("  *****  " + " " + "  *****  " + " " + "*        " + " " + "  *****  ");
    }
}
