/**
 * OOPSBannerApp UC1, UC2 & UC3 - Banner Display Application
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
 * UC3: Banner output (String.join)
 * - Refactors the UC2 implementation to assemble each printed line using
 *   `String.join(" ", ...)` instead of the `+` operator. This reduces
 *   intermediate String creation and improves readability while preserving
 *   the exact visual output of UC2.
 *
 * Key concepts: ASCII art, `String.join()`, memory efficiency, refactoring.
 *
 * @author Akshat Tiwari
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC1: simple output
        // Print the literal message as in the first user story.
        System.out.println("OOPS");

        // Render OOPS as a 7-line banner using '*' and spaces.
        // Each character is 7 lines tall and 9 characters wide.

        // UC2 (original): Banner lines assembled using string concatenation with +
        // Preserved here and active to show progression from UC1 -> UC2 -> UC3.
        System.out.println("  *****  " + " " + "  *****  " + " " + "*******  " + " " + "  *****  ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*      * " + " " + " *     * ");
        System.out.println("*       *" + " " + "*       *" + " " + "*      * " + " " + "*        ");
        System.out.println("*       *" + " " + "*       *" + " " + "*******  " + " " + "  ****   ");
        System.out.println("*       *" + " " + "*       *" + " " + "*        " + " " + "       * ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*        " + " " + " *     * ");
        System.out.println("  *****  " + " " + "  *****  " + " " + "*        " + " " + "  *****  ");

        // UC3: Banner lines assembled using String.join(" ", ...) for clarity and efficiency
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "*******  ", "  *****  "));
        System.out.println(String.join(" ", " *     * ", " *     * ", "*      * ", " *     * "));
        System.out.println(String.join(" ", "*       *", "*       *", "*      * ", "*        "));
        System.out.println(String.join(" ", "*       *", "*       *", "*******  ", "  ****   "));
        System.out.println(String.join(" ", "*       *", "*       *", "*        ", "       * "));
        System.out.println(String.join(" ", " *     * ", " *     * ", "*        ", " *     * "));
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  "));
    }
}
