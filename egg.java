import java.util.Random;

public class egg {
    public static void main(String[] args) {
        String gog = "gog31";
        System.out.println(gog + " is awesome!!");
        // deeter type

        byte coolNumber = 3; // do -128 to 127
        System.out.println(coolNumber + 5.1);
        System.out.println(fregley());
        if (coolNumber > 2) {
            System.out.println("nugget".toUpperCase());
        } else {
            System.out.println('c');
        }
        String coolcat;
        coolcat = gog.concat(fregley());
        System.out.println(coolcat);
        System.out.println(gog.substring(1, 3) + "g");

        System.out.println("i can count to 1000!");
        Random rand = new Random();
        for (byte i = 0; i < 100; i++) {
            int randInt = rand.nextInt(11);
            if (randInt > 9) {
                System.out.println("oh i forgot that one");
            } else {
                System.out.println(100 - i);
            }
        }
        System.out.println("ok i give up");
    }

    public static String fregley() {
        return "fregley";
    }
}