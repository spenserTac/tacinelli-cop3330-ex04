import java.util.Scanner;

public class Exercise_4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a adjective: ");
        String adj = scanner.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " +  noun + " " + adverb +
                "? That's hilarious!");
    }
}
