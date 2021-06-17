package Solutions;

class Plaindrome {
    public static boolean isPalindrome(int x) {
        int length = (int) (Math.log10(x) + 1);
        int reversedNumber = 0, number = x, multiplyingFactor = 1;
        int exponent = length - 1;
        if (length == 1) {
            return true;
        } else if (constraintViolation(x)) {
            return false;
        }
        while (x >= 1) {
            multiplyingFactor = (int) (Math.pow(10, exponent));
            reversedNumber += x % 10 * multiplyingFactor;
            exponent -= 1;
            x /= 10;
        }
        int result = number - reversedNumber;
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean constraintViolation(int number) {
        return number < 0 || number > Integer.MAX_VALUE - 1;
    }

    public static void main(String args[]) {
        int number = 1001;
        boolean result = isPalindrome(number);
        System.out.println(result);
    }
}