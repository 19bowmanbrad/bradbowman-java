import java.util.Arrays;

public class worksheetFourTwo {
    public static void main(String [] args){
        //1a
        int[] numbers = {11, 4, 99, 2, 44, 0, 0, 0};
        System.out.println("14");
        System.out.println("6");
        System.out.println("2200");
        System.out.println("98");
        //1b
        System.out.println("[11, 4, 99, 2, 44, 0, 0, 0]");
        //1c
        System.out.println("[3, 3, 0, 0, 6, 9, 0, -18]");
        //1d
        int [] array1 = {5, 1, 8, 4, 1};
        int maxNum = forEachMax(array1);
        System.out.println(maxNum);
        //1e
        int [] array2 = {10, -2, 4, -4, 9, -5, 19, -7, 39, -1};
        double avgNum = average(array2);
        System.out.println("The average is "+ avgNum);
        //2a
        int[] doubleArray = doubleValues(array1);
        System.out.println(Arrays.toString(doubleArray));
        //2b
        int[] arrayCopy = copyValues(numbers, 0, 3);
        System.out.println(Arrays.toString(arrayCopy));
        //2c
        int[] fourtyTwoArray = fourtyTwo(numbers);
        System.out.println(Arrays.toString(fourtyTwoArray));
        //3
        int rangeOfArray1 = range(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("The range is " + rangeOfArray1);
        int rangeOfArray2 = range(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("The range is " + rangeOfArray2);
        //4
        int mode = mode(array1);
        System.out.println("The mode is " + mode);
        int [] modeTest = {1, 3, 9, 10, 88, 42, 10, 42, 4, 1};
        mode = mode(modeTest);
        System.out.println("The mode is " + mode);

    }
    //1d
    public static int forEachMax(int[] array){
        int maxNum = 0;
        for(int x: array){
            if (x > maxNum){
                maxNum = x;
            }
        }
        return maxNum;
    }
    //1e
    public static double average(int [] array){
        double sum = 0;
        for (int x: array){
            sum += x;
        }
        return (sum/ array.length);
    }
    //2a
    public static int[] doubleValues(int [] array){
        for (int x = 0; x < array.length; x ++){
            array[x] *= 2;
        }
        return array;
    }
    //2b
    public static int[] copyValues(int[] original, int start, int finish){
        int[] arrayCopy = new int [(finish + 1)];
        for (int i = start; i <= finish; i++){
            arrayCopy[i] = original [i];
        }
        return (arrayCopy);
    }
    //2c
    public static int[] fourtyTwo(int [] original){
        int [] fourtyTwo = new int[original.length];
        for(int i = 0; i < original.length; i++){
            fourtyTwo[i] = 42;
        }
        return fourtyTwo;
    }
    //3
    public static int range(int [] array){
        int maxValue = array[0];
        int minValue = array[0];
        for(int i=1;i < array.length;i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        for(int i=1;i < array.length;i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return (maxValue - minValue + 1);
    }
    //4
    public static int mode(int [] array) {
        int maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; ++i){
            int count = 0;
            for (int j = 0; j < array.length; ++j){
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}