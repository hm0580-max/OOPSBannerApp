/**
 * OOPSBannerApp UC4 – Double-Lined Banner using String Array and Loop
 * Uses String array + String.join() + for-each loop
 */

public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Step 1: Create array to store banner lines
        String[] lines = new String[7];

        // Step 2: Populate array using String.join() (DOUBLE-LINED)
        lines[0] = String.join("", "  *****   ", "  *****   ", " ******  ", "  ***** ");
        lines[1] = String.join("", " **   **  ", " **   **  ", " **   ** ", " **     ");
        lines[2] = String.join("", "**     ** ", "**     ** ", " **   ** ", " **     ");
        lines[3] = String.join("", "**     ** ", "**     ** ", " ******  ", "  ****  ");
        lines[4] = String.join("", "**     ** ", "**     ** ", " **      ", "     ** ");
        lines[5] = String.join("", " **   **  ", " **   **  ", " **      ", " **   **");
        lines[6] = String.join("", "  *****   ", "  *****   ", " **      ", "  ***** ");

        // Step 3: Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
