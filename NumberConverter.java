//Asked in Deloitee, it is used to convert binary number to decimal and decimal number to binary
class Convert {
    static void decimalToBinary(int decimal) {
        String strBinary = Integer.toBinaryString(decimal); // it take int value as input and return string value as
                                                            // output
        int binary = Integer.parseInt(strBinary);

        System.out.println("Binary value of " + decimal + " is: " + binary);
    }

    static void binaryToDecimal(String strBinary) {
        int decimal = Integer.valueOf(strBinary, 10); 
        // as it is binary so radix value is 2. Value of return int(premetive) type data
        // 2 → binary
        // 8 → octal
        // 10 → decimal
        // 16 → hexadecimal

        System.out.println("Decimal value of " + strBinary + " is: " + decimal);
    }
}

public class NumberConverter {
    public static void main(String[] args) {
        Convert.decimalToBinary(10);
        Convert.binaryToDecimal("101");
    }
}
