public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 123; 
        int reversed = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (number == reversed) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
