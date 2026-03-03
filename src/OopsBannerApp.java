public class OopsBannerApp {

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

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // O (9-width)
        String[] O = {
            "   *****  ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "   *****  "
        };

        // P (9-width)
        String[] P = {
            "  ******  ",
            "  *     * ",
            "  *     * ",
            "  ******  ",
            "  *       ",
            "  *       ",
            "  *       "
        };

        // S (9-width)
        String[] S = {
            "   ****** ",
            "  *       ",
            "  *       ",
            "   *****  ",
            "        * ",
            "        * ",
            "  ******  "
        };

        // Space (9-width)
        String[] space = {
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        };

        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        charMaps[3] = new CharacterPatternMap(' ', space);

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // default-space
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                System.out.print(pattern[row] + "  ");  // spacing between letters
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}