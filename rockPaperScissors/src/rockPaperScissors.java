import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args) {
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
        int userWins = 0;
        int compWins = 0;
        int ties = 0;
        int userGameWins = 0;
        int compGameWins = 0;
        for (int i = 1; i <= numGames; i++) {
            System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
            int userChoice = userInput.nextInt();
            while (userChoice != 0 && userChoice != 1 && userChoice != 2) {
                System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
                userChoice = userInput.nextInt();
            }
            String myChoice = rockPaperScissorsNums(userChoice, userName);
            System.out.println(myChoice);
            int compNum = computerChoice();
            String compChoice = rockPaperScissorsNums(compNum, "Computer");
            System.out.println(compChoice);
            if (((userChoice == 0) && (compNum == 2)) || ((userChoice == 1) && (compNum == 0)) || ((userChoice == 2) && (compNum == 1))) {
                System.out.println(userName + " wins the round!");
                userWins += 1;
            } else if (((compNum == 0) && (userChoice == 2)) || ((compNum == 1) && (userChoice == 0)) || ((compNum == 2) && (userChoice == 1))) {
                System.out.println("Computer wins the round!");
                compWins += 1;
            } else if (userChoice == compNum){
                System.out.println("Tie!");
                i -= 1;
                ties += 1;
            }
            System.out.println("Score: " + userName + " = " + userWins + " Computer = " + compWins +". Ties - " + ties);
        }
        if (userWins > compWins){
            System.out.println(userName + " wins the game " + userWins + " to " + compWins + "!");
            userGameWins += 1;
        } else if (compWins > userWins){
            System.out.println("Computer wins the game " + compWins + " to " + userWins + "!");
            compGameWins += 1;
        }
        System.out.println();
        System.out.println("Would you like to play again? -y -n");
        String yesNo = userInput.next();
        userWins = 0;
        compWins = 0;
        ties = 0;
        while (yesNo.equals("y")){
            System.out.println("How many games would you like to play? -3 or -5");
            numGames = userInput.nextInt();
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
            for (int i = 1; i <= numGames; i++) {
                System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
                int userChoice = userInput.nextInt();
                while (userChoice != 0 && userChoice != 1 && userChoice != 2) {
                    System.out.println("Choose a number! -0(rock) -1(paper) -2(scissors)");
                    userChoice = userInput.nextInt();
                }
                String myChoice = rockPaperScissorsNums(userChoice, userName);
                System.out.println(myChoice);
                int compNum = computerChoice();
                String compChoice = rockPaperScissorsNums(compNum, "Computer");
                System.out.println(compChoice);
                if (((userChoice == 0) && (compNum == 2)) || ((userChoice == 1) && (compNum == 0)) || ((userChoice == 2) && (compNum == 1))) {
                    System.out.println(userName + " wins the round!");
                    userWins += 1;
                } else if (((compNum == 0) && (userChoice == 2)) || ((compNum == 1) && (userChoice == 0)) || ((compNum == 2) && (userChoice == 1))) {
                    System.out.println("Computer wins the round!");
                    compWins += 1;
                } else if (userChoice == compNum){
                    System.out.println("Tie!");
                    ties += 1;
                    i -= 1;
                }
                System.out.println("Score: " + userName + " = " + userWins + " Computer = " + compWins + ". Ties - " + ties);
            }
            if (userWins > compWins){
                System.out.println(userName + " wins the game " + userWins + " to " + compWins + "!");
                userGameWins += 1;
            } else if (compWins > userWins){
                System.out.println("Computer wins the game " + compWins + " to " + userWins + "!");
                compGameWins += 1;
            }
            System.out.println("Would you like to play again? -y -n");
            yesNo = userInput.next();
        }
        System.out.println("Thanks for playing! User game wins: " + userGameWins + ". Computer game wins: " + compGameWins + ".");
    }

    public static String rockPaperScissorsNums(int choice, String name) {
        // final String userChoice = "";
        if (choice == 0) {
            return (name + " chose rock!");
        } else if (choice == 1) {
            return (name + " chose paper!");
        } else {
            return (name + " chose scissors!");
        }
    }

    public static int computerChoice() {
        Random rand = new Random();
        return (rand.nextInt(2));
    }

    public static String winLose(int user, int computer, String userName, int numGames) {
        int userWins = 0;
        int compWins = 0;
        int ties = 0;
        if (((user == 0) && (computer == 2)) || ((user == 1) && (computer == 0)) || ((user == 2) && (computer == 1))) {
            System.out.println(userName + " wins the round!");
            userWins += 1;
        } else if (((computer == 0) && (user == 2)) || ((computer == 1) && (user == 0)) || ((computer == 2) && (user == 1))) {
            System.out.println("Computer wins the round!");
            compWins += 1;
        } else if (user == computer){
            System.out.println("Tie!");
            ties += 1;
        }
        if (userWins == numGames) {
            System.out.println(userName + " wins the game " + userWins + " to " + compWins + "!");
        } else if (compWins == numGames) {
            System.out.println("Computer wins the game " + compWins + " to " + userWins + "!");
        }
        return ("Score: User -" + userWins + " Computer -" + compWins + ". Ties - " + ties);
    }
}
