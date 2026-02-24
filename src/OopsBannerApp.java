public class OopsBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one step using String.join()
        String[] lines = {
            String.join(" ", " *****  ", " *****  ", " ****** ", " *****  "),
            String.join(" ", "*     * ", "*     * ", "*     * ", "*     * "),
            String.join(" ", "*     * ", "*     * ", "*     * ", "*      "),
            String.join(" ", "*     * ", "*     * ", "******  ", " ***** "),
            String.join(" ", "*     * ", "*     * ", "*       ", "      *"),
            String.join(" ", "*     * ", "*     * ", "*       ", "*     *"),
            String.join(" ", " *****  ", " *****  ", "*       ", " ***** ")
        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}