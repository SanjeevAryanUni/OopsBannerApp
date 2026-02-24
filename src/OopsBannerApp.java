public class OopsBannerApp {

    public static void main(String[] args) {

        // Array to store all 7 banner rows
        String[] lines = new String[7];

        // Construct each row using String.join()
        lines[0] = String.join(" ", " *****  ", " *****  ", " ****** ", " *****  ");
        lines[1] = String.join(" ", "*     * ", "*     * ", "*     * ", "*     * ");
        lines[2] = String.join(" ", "*     * ", "*     * ", "*     * ", "*      ");
        lines[3] = String.join(" ", "*     * ", "*     * ", "******  ", " ***** ");
        lines[4] = String.join(" ", "*     * ", "*     * ", "*       ", "      *");
        lines[5] = String.join(" ", "*     * ", "*     * ", "*       ", "*     *");
        lines[6] = String.join(" ", " *****  ", " *****  ", "*       ", " ***** ");

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}