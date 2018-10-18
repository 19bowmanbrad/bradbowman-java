public class mathStuff {
    public static void main(String[] args) {
        int answer = addNum( 3, 4);
        System.out.println(answer);
        int minimum = minNum(4,8,12);
        System.out.println(minimum);
    }

    public static int addNum(int num1, int num2) {
        int sum = (num1 + num2);
        return (sum);
    }
    public static int minNum (int num1, int num2, int num3){
        return Math.min((Math.min(num1, num2)), num3);
    }
}
