import java.util.Random;

public class RandomNo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        System.out.println("Random Number: " + randomNumber);
    }
}
