/**
 * OOPSBannerApp UC7 – Store Character Pattern in an Inner Class
 * Prints OOPS banner using double stars (**)
 */

public class OOPSBannerAppUC7 {

    /**
     * Inner static class to store character and pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create character pattern objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // O pattern
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ****   ",
                " **    ** ",
                "**      **",
                "**      **",
                "**      **",
                " **    ** ",
                "   ****   "
        });

        // P pattern
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "******  ",
                "**   ** ",
                "**   ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        });

        // S pattern
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "     **",
                "     **",
                "*****  "
        });

        // Space pattern
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
        });

        return charMaps;
    }

    // Get pattern for character
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    // Print banner
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);

                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}