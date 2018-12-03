import java.util.Scanner;
import java.util.Random;
public class dice {
    public static final int DICENUM = 1;
    public static void main(String[] args){
        String dice[][] = new String [6][5];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to play a game? -y -n");
        String yesNo = userInput.next();
        while(yesNo.equals("y")){
            String gameDice[][] = new String [DICENUM][5];
            defDice(1, dice);
            printDice();
            rollDice();
            drawLine();
            System.out.println("Keep playing? -y -n");
            yesNo = userInput.next();
        }
    }
    public static String[] defDice(int roll, String [][] dice) {
        System.out.println("defdice");
        String topBottom =  " ------- ";
        String blank =      "|       |";
        String oneStar =    "|   *   |";
        String twoStar =    "| *   * |";
        String topLeft =    "| *     |";
        String bottomRight ="|     * |";
        dice[0][0] = topBottom;
        dice[0][4] = topBottom;
        for (int i = 0; i < dice.length; i++)
        if (roll == 0){
            dice[i][1] = blank;
            dice[i][2] = oneStar;
            dice[i][3] = blank;
        } else if (roll == 1){
            dice[i][1] = blank;
            dice[i][2] = twoStar;
            dice[i][3] = blank;
        } else if (roll == 2){
            dice[i][1] = topLeft;
            dice[i][2] = oneStar;
            dice[i][3] = bottomRight;
        } else if (roll == 3){
            dice[i][1] = twoStar;
            dice[i][2] = blank;
            dice[i][3] = twoStar;
        } else if (roll == 4){
            dice[i][1] = twoStar;
            dice[i][2] = oneStar;
            dice[i][3] = twoStar;
        }

    }
    public static String[] printDice() {
        System.out.println("printDice");
        String [] blank = {};
        return blank;
    }
    public static int rollDice(){
        System.out.println("rollDice");
        return(0);
    }
    public static void drawLine(){
        System.out.println("drawLine");
    }

}
