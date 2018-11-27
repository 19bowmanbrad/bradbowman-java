import java.util.*;
public class workSheetFourOne {
    public static void main (String []args){
        //exercise 1
        int [] arrayOne = new int[8];
        // exercise 2
        //2a
        arrayOne [0] = 1;
        arrayOne [1] = 2;
        arrayOne [2] = 3;
        arrayOne [3] = 4;
        arrayOne [4] = 5;
        arrayOne [5] = 6;
        arrayOne [6] = 7;
        arrayOne [7] = 8;
        //2b
        int [] arrayTwo = {1,2,3,4,5,6,7,8};
        //2c
        int [] arrayThree = new int[5];
        for (int i = 0; i <= 4; i++){
            arrayThree[i] = i;
        }
        //2d
        Scanner inputArray = new Scanner (System.in);
        int [] arrayFour = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a number into the array.");
            arrayFour[i] = inputArray.nextInt();
            System.out.println(Arrays.toString(arrayFour));
        }
        //2e
        int [] arrayFive = {-4, 19, 3, 20, 72, 58};
        //exercise 3
        //3a
        System.out.println(arrayFive[(arrayFive.length -1)]);
        //3b
    }
}
