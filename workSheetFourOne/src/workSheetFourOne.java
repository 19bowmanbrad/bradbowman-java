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
        int[] middle = makeMiddle(arrayFive);
        System.out.println(Arrays.toString(middle));
        //3c
        for (int i = 0; i < arrayFive.length; i++){
            arrayFive[i]--;
        }
        System.out.println(Arrays.toString(arrayFive));
        //3d
        int count = 0;
        int[] even = new int [500];
        for (int x = 0; x < 1000; x+=2){
            even[count] = x;
            count ++;
        }
        System.out.println(Arrays.toString(even));
        //3f
        System.out.println((even[100]));
        //3g
        System.out.println((even[278]) + " " + even[456]);
    }
    //3b
    public static int[] makeMiddle(int[] nums){
        int[] a;
        if (nums.length % 2 == 0){
            a = new int[2];
            a[0] = nums[(nums.length/2) - 1];
            a[1] = nums[nums.length/2];
        } else{
            a = new int[1];
            a[0] = nums[nums.length/2];
        }
        return a;
    }
}
