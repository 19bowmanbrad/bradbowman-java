import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[]args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = userInput.next();
        System.out.println("Nice to meet you, " + userName + "!");
        System.out.println("How many games would you like to play? -3 or -5");
        int numGames = userInput.nextInt();
        if (numGames == 3 || numGames == 5) { //Forces player to choose either 3 or 5 games.
            System.out.println("You have chosen to play " + numGames + " games!");
        } else {
            while (numGames != 3 && numGames != 5) { //asks for input until 3 or 5 games is chosen.
                System.out.println("Choose three or five games.");
                System.out.println("How many games would you like to play? -3 or -5");
                numGames = userInput.nextInt();
            }
            System.out.println("You have chosen to play " + numGames + " games!");
        }
        System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
        int userChoice = userInput.nextInt();
        String myChoice = rockPaperScissorsNums(userChoice, userName);
        System.out.println(myChoice);
    }
    public static String rockPaperScissorsNums(int choice, String name) {
        if (choice == 0) {
            return (name + "chose rock!");
        } else if (choice == 1) {
            return (name + " chose paper!");
        } else if (choice == 2) {
            return (name + " chose scissors!");
        } else {
            choice =choiceInputRepat(name);
            rockPaperScissorsNums(choice, name);
        }
        return"Game on!";
    }
    public static int choiceInputRepat(String name) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
        int userChoice = userInput.nextInt();
        if (userChoice == 0 || userChoice == 1 || userChoice == 2) {
            rockPaperScissorsNums(userChoice, name);
        } else {
            while (userChoice != 0 && userChoice != 1 && userChoice != 2) {
                System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
                userChoice = userInput.nextInt();
            }
           rockPaperScissorsNums(userChoice, name);
        }
        return userChoice;
    }
}
