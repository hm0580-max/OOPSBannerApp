/**
 * OOPSBannerApp UC6 – OOPS Banner using Static Methods
 * Refactored using helper methods for each character
 */

public class OOPSBannerAppUC6 {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
            "  *****   ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "  *****   "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
            "  ***** ",
            " **     ",
            " **     ",
            "  ****  ",
            "     ** ",
            " **  **",
            "  ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble O O P S
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + 
                oPattern[i] + 
                pPattern[i] + 
                sPattern[i]
            );
        }
    }
}