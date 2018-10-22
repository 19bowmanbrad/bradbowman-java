public class mathStuff {
    public static void main(String[] args) {
        int answer = addNum( 3, 4);
        System.out.println("The sum of these numbers is " + answer);
        int minimum = minNum(4,8,12);
        System.out.println("The minimum is " + minimum);
        double minPlusMax = minMaxSum(3,6,13);
        System.out.println("The square root of the sum of the minimum and maximum is " +minPlusMax);
     }

    public static int addNum(int num1, int num2) {
        int sum = (num1 + num2);
        return (sum);
    }
    public static int minNum (int num1, int num2, int num3){
        return Math.min((Math.min(num1, num2)), num3);
    }
    public static double minMaxSum (double num1, double num2, double num3){
        double minimum = Math.min((Math.min(num1, num2)), num3);
        double maximum = Math.max((Math.min(num1, num2)), num3);
        return (Math.sqrt(minimum + maximum));
    }
}

