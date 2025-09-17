public class SumofDigits {
    public static void main(String[] args) {
        int number = 432; 
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }
}
