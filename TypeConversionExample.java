public class TypeConversionExample {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = intValue;  // Implicit conversion from int to double
        System.out.println("Implicit conversion: int to double -> " + doubleValue);
        double anotherDoubleValue = 9.99;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("Explicit conversion: double to int -> " + anotherIntValue);
    }
}
