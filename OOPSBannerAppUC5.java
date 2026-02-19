/**
 * OOPSBannerApp UC5 – Double-Lined Banner using Inline Array Initialization
 * Uses inline array + String.join() + for-each loop
 */

public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] lines = {
            String.join("", "  *****   ", "  *****   ", " ******  ", "  ***** "),
            String.join("", " **   **  ", " **   **  ", " **   ** ", " **     "),
            String.join("", "**     ** ", "**     ** ", " **   ** ", " **     "),
            String.join("", "**     ** ", "**     ** ", " ******  ", "  ****  "),
            String.join("", "**     ** ", "**     ** ", " **      ", "     ** "),
            String.join("", " **   **  ", " **   **  ", " **      ", " **   **"),
            String.join("", "  *****   ", "  *****   ", " **      ", "  ***** ")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
