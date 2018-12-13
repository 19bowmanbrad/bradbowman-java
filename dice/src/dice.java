import java.util.*;
public class dice {
    public static final int DICENUM = 1;
    public static void main(String[] args){
        String gameDice[][] = new String [6][5];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to play a game? -y -n");
        String yesNo = userInput.next();
        int roll = rollDice();
        gameDice = defDice(roll, gameDice);

        while(yesNo.equals("y")){
            gameDice = defDice(roll, gameDice);
            printDice(gameDice);
            roll = rollDice();
            drawLine();
            System.out.println("Keep playing? -y -n");
            yesNo = userInput.next();
        }
    }
    public static String[][] defDice(int roll, String [][] dice) {
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
        } else if (roll == 5){
            dice[i][1] = twoStar;
            dice[i][2] = twoStar;
            dice[i][3] = twoStar;
        }
        return dice;

    }
    public static void printDice(String [][] dice) {
        for (int i = 0; i < dice.length - 1; i++){
            System.out.println(dice[DICENUM - 1][i]);
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
