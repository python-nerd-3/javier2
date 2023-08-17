import java.util.Random;

public class counter {
    public static void main(String[] args) {
        System.out.println("i can count to 1000!");
        Random rand = new Random();
        for (byte i = 0; i < 100; i++) {
            int randInt = rand.nextInt(11);
            if (randInt > 9) {
                System.out.println("oh i forgot that one");
            } else {
                System.out.println(100 - i + (randInt - 5));
            }
        }
        System.out.println("ok i give up");
    }
}
