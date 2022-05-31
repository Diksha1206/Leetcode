package Numbers;



public class ReverseInteger {

    public static long reverseNumber(long number) {
        long result = 0;
        long length = (long) (Math.log10(number) + 1);
        if (isSignedInteger(number)) {
            while (number > 0) {
                result += ((number % 10)) * (Math.pow(10, (length - 1)));
                length--;
                number = number / 10;
            }
        } else {
            return -1;
        }
        return result;
    }

    public static boolean isSignedInteger(long number) {
        return (number >= 0 && number < 4294967296l);
    }

    public static void main(String args[]) {
        long number = 1534236469;
        long reversedNumber = reverseNumber(number);
        if (reversedNumber > 0) {
            System.out.println("The reversed number is " + reversedNumber);
        } else {
            System.out.println("Invalid number, Please enter a valid signed 32 bit integer ");
        }

    }
}
