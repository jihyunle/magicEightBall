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

            // Generate a random number between 1 and 20
            Random rnd = new Random();
            int number = 0;
            number = rnd.nextInt(20)+1;

            // Call method to assign a response to each number
            String str = "";
            str = getAnswer(number);

            // Print the statements
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

    public static String getAnswer(int number){
        String str = "";
        switch (number){
            case 1:
                str = "It is certain";
                break;
            case 2:
                str = "It is decidedly so";
                break;
            case 3:
                str = "Without a doubt";
                break;
            case 4:
                str = "Yes definitely";
                break;
            case 5:
                str = "You may rely on it";
                break;
            case 6:
                str = "Ah I see it, yes";
                break;
            case 7:
                str = "Most Likely";
                break;
            case 8:
                str = "Outlook good";
                break;
            case 9:
                str = "Yes";
                break;
            case 10:
                str = "Signs point to yes";
                break;
            case 11:
                str = "Reply hazy try again";
                break;
            case 12:
                str = "Ask again later";
                break;
            case 13:
                str = "Better not tell you now";
                break;
            case 14:
                str = "Cannot predict now";
                break;
            case 15:
                str = "Concentrate and ask again";
                break;
            case 16:
                str = "Don't count on it";
                break;
            case 17:
                str = "My reply is no";
                break;
            case 18:
                str = "My sources say no";
                break;
            case 19:
                str = "Outlook not so good";
                break;
            case 20:
                str = "Very doubtful";
                break;
        }
        return str;


    }
}
