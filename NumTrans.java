public class NumTrans {
    
    public static int transformNumber(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Swap the first and last digits
        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);
        
        // Remove first and last digits
        String middleDigits = numberStr.substring(1, numberStr.length() - 1);
        
        // Concatenate last digit, middle digits, and first digit
        String transformedStr = lastDigit + middleDigits + firstDigit;
        
        // Convert the transformed string back to an integer
        int transformedNumber = Integer.parseInt(transformedStr);
        
        return transformedNumber;
    }
    
    public static void main(String[] args) {
        int number1 = 27562;
        int number2 = 123456;
        
        // Transform numbers
        int transformedNumber1 = transformNumber(number1);
        int transformedNumber2 = transformNumber(number2);
        
        // Output transformed numbers
        System.out.println("Transformed number for 27562: " + transformedNumber1);
        System.out.println("Transformed number for 123456: " + transformedNumber2);
    }
}
