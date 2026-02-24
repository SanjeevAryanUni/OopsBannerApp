public class OOPSBannerApp {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
            String.join(" ", " ***** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", " ***** ")
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
            String.join(" ", "****** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "****** "),
            String.join(" ", "*      "),
            String.join(" ", "*      "),
            String.join(" ", "*      ")
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
            String.join(" ", " ***** "),
            String.join(" ", "*      "),
            String.join(" ", "*      "),
            String.join(" ", " ***** "),
            String.join(" ", "      *"),
            String.join(" ", "      *"),
            String.join(" ", " ***** ")
        };
    }

    public static void main(String[] args) {

        // Get patterns for letters
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Combine and print line-by-line
        for (int i = 0; i < o1.length; i++) {
            System.out.println(
                o1[i] + "  " +
                o2[i] + "  " +
                p[i]  + "  " +
                s[i]
            );
        }
    }
}