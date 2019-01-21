import java.util.*;
public class dice2 {
    public static final int DICENUM = 5;
    public static void main(String[] args){
        String dice[][] = new String [6][5];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to play a game? -y -n");
        String yesNo = userInput.next();
        defDice(dice);
        int numGames = 0;

        while(yesNo.equals("y")){
            String gameDice[][] = new String [DICENUM][5];
            for(int i = 0; i < DICENUM; i++) {
                int roll = rollDice();
                gameDice[i] = dice[roll];
            }

            printDice(gameDice);
            drawLine();
            System.out.println("Keep playing? -y -n");
            yesNo = userInput.next();
            numGames ++;
        }
        System.out.println("You played " + numGames + " times!");
    }
    public static String[][] defDice(String [][] dice) {

        for(int i = 0; i < dice.length; i++) {
            String topBottom =      " ------- ";
            String blank =          "|       |";
            String oneStar =        "|   *   |";
            String twoStar =        "| *   * |";
            String topLeft =        "| *     |";
            String bottomRight =    "|     * |";

            if (i == 0) {
                dice[i][0] = topBottom;
                dice[i][1] = blank;
                dice[i][2] = oneStar;
                dice[i][3] = blank;
                dice[i][4] = topBottom;
                System.out.println();
            } else if (i == 1) {
                dice[i][0] = topBottom;
                dice[i][1] = blank;
                dice[i][2] = twoStar;
                dice[i][3] = blank;
                dice[i][4] = topBottom;
                System.out.println();
            } else if (i == 2) {
                dice[i][0] = topBottom;
                dice[i][1] = topLeft;
                dice[i][2] = oneStar;
                dice[i][3] = bottomRight;
                dice[i][4] = topBottom;
                System.out.println();
            } else if (i == 3) {
                dice[i][0] = topBottom;
                dice[i][1] = twoStar;
                dice[i][2] = blank;
                dice[i][3] = twoStar;
                dice[i][4] = topBottom;
                System.out.println();
            } else if (i == 4) {
                dice[i][0] = topBottom;
                dice[i][1] = twoStar;
                dice[i][2] = oneStar;
                dice[i][3] = twoStar;
                dice[i][4] = topBottom;
                System.out.println();
            } else if (i == 5) {
                dice[i][0] = topBottom;
                dice[i][1] = twoStar;
                dice[i][2] = twoStar;
                dice[i][3] = twoStar;
                dice[i][4] = topBottom;
                System.out.println();
            }
        }
            return dice;
    }
    public static void printDice(String [][] dice) {
        for(int i = 0; i < dice[0].length; i++){
            for (String[] allDice : dice)
                System.out.print(allDice[i] + "\t");
            System.out.println();
        }
    }

    public static int rollDice(){
        Random rand = new Random();
        int roll = rand.nextInt(6);
        return(roll);
    }
    public static void drawLine(){
        for (int i = 0; i < 20; i ++){
            System.out.print("_");
        }
    }

}