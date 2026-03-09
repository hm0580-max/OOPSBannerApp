import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // Create HashMap storing character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // O pattern
        charMap.put('O', new String[]{
                "   ****   ",
                " **    ** ",
                "**      **",
                "**      **",
                "**      **",
                " **    ** ",
                "   ****   "
        });

        // P pattern
        charMap.put('P', new String[]{
                "******  ",
                "**   ** ",
                "**   ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        });

        // S pattern
        charMap.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "     **",
                "     **",
                "*****  "
        });

        // Space pattern
        charMap.put(' ', new String[]{
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
        });

        return charMap;
    }

    // Display banner
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}