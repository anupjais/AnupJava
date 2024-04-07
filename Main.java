public class Main {
    static String colorEscape = "\033[91;1m";
    public static void main(String[] args) {
        // String colorEscape = getRedColorEscape();
        // String colorEscape = "\033[91;1m";
        System.out.println(colorEscape+"Color escape sequence: ");
    }

    // Function to get the red color escape sequence
    public static String getRedColorEscape() {
        return "\033[91m";
    }
}
