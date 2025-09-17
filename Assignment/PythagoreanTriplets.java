public class PythagoreanTriplets {
    public static void main(String[] args) {
        int limit = 20; 
        System.out.println("Pythagorean triplets up to " + limit + ":");
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c * c == a * a + b * b && c <= limit) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }
}
