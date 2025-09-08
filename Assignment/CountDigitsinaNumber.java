public class CountDigitsinaNumber {
    public static void main(String[] args) {
        int number = 98765; 
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
