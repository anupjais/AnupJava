public class SimpleTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;  // Change this to adjust the number of rows in the triangle

        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >=1; j--) {
            	num+=j;
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
