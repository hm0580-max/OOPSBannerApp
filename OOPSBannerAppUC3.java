/**
 * OOPSBannerApp UC3 - Modular Banner using Functions
 * Prints DOUBLE-LINED OOPS banner using * and + concatenation.
 */

public class OOPSBannerAppUC3 {

    // Function to print banner
    public static void printBanner() {

        System.out.println("  *****   " + "  *****   " + " ******  " + "  ***** ");
        System.out.println(" **   **  " + " **   **  " + " **   ** " + " **     ");
        System.out.println("**     ** " + "**     ** " + " **   ** " + " **     ");
        System.out.println("**     ** " + "**     ** " + " ******  " + "  ****  ");
        System.out.println("**     ** " + "**     ** " + " **      " + "     ** ");
        System.out.println(" **   **  " + " **   **  " + " **      " + " **   **");
        System.out.println("  *****   " + "  *****   " + " **      " + "  ***** ");
    }

    public static void main(String[] args) {
        printBanner();
    }
}
