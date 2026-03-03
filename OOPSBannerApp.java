/**
 * OOPSBannerApp UC3 - Banner Display Application
 *
 * This class demonstrates the third user story:
 *
 * UC3: Banner output (String.join)
 * - Refactors the banner implementation to assemble each printed line using
 *   `String.join(" ", ...)` instead of the `+` operator. This reduces
 *   intermediate String creation and improves readability while preserving
 *   the exact visual output of the banner.
 *
 * @author Akshat Tiwari
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
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
