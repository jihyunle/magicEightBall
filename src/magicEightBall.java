import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class magicEightBall {

    public static void main(String[]args){

        // Ask if user wants to play
        Scanner input = new Scanner(System.in);
        String playAgain = "";

        System.out.println("Do you have a question for the Magic 8-Ball? (y/n)");
        playAgain = input.nextLine();
        System.out.println();

        // Loop for as long as the answer is not "n"
        while (!playAgain.equalsIgnoreCase("n")){

            // Prompt the user for a question
            System.out.println("What is your question?");
            String userQuestion = input.nextLine();
            System.out.println();
            System.out.println("YOU ASKED: " + userQuestion + "\n");

            // Call magicEightBall method that will pick a random selection
            // from the String array of possible responses
            String str = modifiedMagicEight();

            // Print the statements
            System.out.println("YOU ASKED: " + userQuestion + "\n");
            System.out.println("MAGIC 8-BALL SAYS: " + str + "\n");

            // Ask the user if they want to play again
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            playAgain = input.nextLine();
            System.out.println();
        }

        // Exit message
        System.out.println("Thank you for playing!");
        input.close();
        System.exit(0);

    }


    public static String magicEightBall(){

        // Create an array of all possible responses
        String[] str = new String[]{"It is certain", "It is decidedly so", "Without a Doubt", "Yes definitely", "You may rely on it",
                "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again",
                "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};

        // Generate a random number between 1 and 20
        int number = 0;
        Random rnd = new Random();
        number = rnd.nextInt(20)+1;

        // Get a random selection from the responses
        return str[number];

    }

    public static String modifiedMagicEight(){
        ArrayList<String> responses = new ArrayList<>();
        responses.add("It is certain");
        responses.add("It is decidedly so");
        responses.add("Without a Doubt");
        responses.add("Yes definitely");
        responses.add("You may rely on it");
        responses.add("As I see it, yes");
        responses.add("Most likely");
        responses.add("Outlook good");
        responses.add("Yes");
        responses.add("Signs point to yes");
        responses.add("Reply hazy try again");
        responses.add("Ask again later");
        responses.add("Better not tell you now");
        responses.add("Cannot predict now");
        responses.add("Concentrate and ask again");
        responses.add("Don't count on it");
        responses.add("My reply is no");
        responses.add("My sources say no");
        responses.add("Outlook not so good");
        responses.add("Very doubtful");

        Random rnd = new Random();
        return responses.get(rnd.nextInt(responses.size()));
    }


}
