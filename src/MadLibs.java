import java.util.Scanner;


public class MadLibs {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        //declare
        String adjective1;
        String noun;
        String verb;
        String adjective2;

        //Prompt the user to enter
        System.out.print("Enter an Adjective(Describing a day): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a Noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a Verb(Gerund): ");
        verb = scanner.nextLine();
        System.out.print("Enter an Adjective: ");
        adjective2 = scanner.nextLine();

        // Display the final output
        System.out.println("\nIt was a " + adjective1 + " day.");

        System.out.println("I see " + noun + " was outside.");

        System.out.println("He/She was " + verb +"." );

        System.out.println("I was " + "to see him/her." );


        scanner.close();





    }
}
