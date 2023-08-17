import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name");
        String name = scanner.nextLine();
        System.out.println("hey i can guess your age in 1 question");
        System.out.println("how old are you?");
        byte age = scanner.nextByte();
        System.out.print("i think you are ");
        System.out.print(age);
        System.out.println(" years old");
        System.out.println("i also know your name from that question, it's " + name);
        scanner.close();
    }
}
