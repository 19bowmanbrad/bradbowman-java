import java.util.*;

public class worksheetFourSix {
    public static void main(String[] args){
        //1
        double [] doubleArray = new double[1028];
        //2
        int[][] twoDim = new int[5][4];
        //3
        String [][] studentSeating = new String[5][4];
        //4
        /*
          0 1 2 3
        _|_________
        0|0 0 0 0
        1|0 0 0 0
        2|0 0 0 0
        3|0 0 0 0
        4|0 0 0 0
         */
        //5
        studentSeating = new String[][]{{"a", "b", "c", "d"}, {"e", "f", "g", "h"}, {"i", "j", "k", "l"}, {"m", "n", "o", "p"}, {"q", "r", "s", "t"}};
//        Scanner userInput = new Scanner(System.in);
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 4; j++){
//                System.out.println("Enter a name. ");
//                String student = userInput.nextLine();
//                studentSeating[i][j] = student;
//            }
//        }
        System.out.println(Arrays.deepToString(studentSeating));
        //6
        System.out.println(studentSeating[1][3]);
        //7
        studentSeating[0][0] = "teacher";
        System.out.println(Arrays.deepToString(studentSeating));
        //8
        studentSeating[1][2] = studentSeating[4][3];
        studentSeating[4][3] = "ME";
        System.out.println(Arrays.deepToString(studentSeating));
        //9
        double[][] temps = new double[10][2];
        //10
        String[][] chess = new String[8][8];
        for (int i = 0; i < 8; i++){
            chess[1][i] = "pawn";
        }
        for (int i = 0; i < 8; i++){
            chess[6][i] = "pawn";
        }
        //11
        int[][] rectangle = new int[4][7];
        for (int i = 1; i <=7; i++){
            rectangle[2][i-1] = i;
        }
        //12
        //int[][] matrix = new int[6][8];
        int[][] matrix = new int [][]{{0, 1, 0, 0, 2, 0, 0, 0}, {0, 1, 0, 0, 2, 0, 0, 0}, {0, 1, 0, 0, 2, 0, 0, 0}, {0, 1, 0, 0, 2, 0, 0, 0}, {0, 1, 0, 0, 2, 0, 0, 0}, {0, 1, 0, 0, 2, 0, 0, 0}};
        int copy = 0;
        for (int i = 0; i < 6; i++){
            copy = matrix[i][4];
            matrix[i][4] = matrix[i][1];
            matrix[i][1] = copy;
        }
        //13
        System.out.println("[[4, 5, 6, 6], [5, 6, 7, 7], [6, 7, 8, 8]]");
        //14
        int[][] multTables = new int[10][12];
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 12; j++){
                multTables[i-1][j-1] = i*j;
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 12; j ++){
                System.out.print(multTables[i][j] + " ");
            }
            System.out.println();
        }
        //15
        for (int i = 0; i < 10; i ++){
            multTables[i][6] = multTables[i][2];
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 12; j ++){
                System.out.print(multTables[i][j] + " ");
            }
            System.out.println();
        }
    }
}
