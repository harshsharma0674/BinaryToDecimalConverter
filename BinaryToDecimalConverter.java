import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        // Check if the input is a valid binary number
        if (!isValidBinary(binaryNumber)) {
            System.out.println("Invalid binary number. Please enter a valid binary string.");
            return;
        }

        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("Decimal equivalent: " + decimalNumber);
    }

    private static boolean isValidBinary(String binaryNumber) {
        // A valid binary number contains only 0s and 1s
        return binaryNumber.matches("[01]+");
    }

    private static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        // Traverse the binary string from right to left
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char digit = binaryNumber.charAt(i);

            // Convert char to int and add to the decimal number
            int bitValue = Character.getNumericValue(digit);
            decimalNumber += bitValue * Math.pow(2, power);

            // Increment the power for the next bit position
            power++;
        }

        return decimalNumber;
    }
}
