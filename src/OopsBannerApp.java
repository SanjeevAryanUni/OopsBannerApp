import java.util.HashMap;

/**
 * UC8 - HashMap Based ASCII Banner ("OOPS")
 */
public class OopsBannerApp {

    // Create HashMap with character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // --- O ---
        charMap.put('O', new String[]{
            "   *****  ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "   *****  "
        });

        // --- P ---
        charMap.put('P', new String[]{
            "  ******  ",
            "  *     * ",
            "  *     * ",
            "  ******  ",
            "  *       ",
            "  *       ",
            "  *       "
        });

        // --- S ---
        charMap.put('S', new String[]{
            "   ****** ",
            "  *       ",
            "  *       ",
            "   *****  ",
            "        * ",
            "        * ",
            "  ******  "
        });

        // --- SPACE ---
        charMap.put(' ', new String[]{
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        });

        return charMap;
    }

    // Display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = charMap.get('O').length;

        for (int line = 0; line < height; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                sb.append(charMap.get(ch)[line]).append("  "); // space between letters
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