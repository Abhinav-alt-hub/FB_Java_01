public class Reverse {
public static void main(String[] args) {
    int number = 12345; 
    int reversednumber = 0;
    while (number !=0){
        int digit = number % 10;
        reversednumber = reversednumber * 10 + digit;
        number = number/10;

    }
    System.out.println("Reversed Number: " + reversednumber);
}
}

