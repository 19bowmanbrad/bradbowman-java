/*
*Brad Bowman
* AP CS A
* Period 1
* September 12, 2018
* project #1-Sixdays of Xmas
 */
public class Sixdays {
    public static void main (String[] args){
        firstDay();
        secondDay();
        thirdDay();
        fourthDay();
        fifthDay();
        sixthDay();
    }
    public static void firstDay(){ //states the first day and calls on the first gift method.
        System.out.println("On the first day of \"Xmas\" my true love gave to me");
        partridge();
        System.out.println();
    }
    public static void secondDay(){ //states the second day, calls second gift method.
        System.out.println("On the second day of \"Xmas\" my true love gave to me");
        turtleDoves();
        System.out.println();

    }
    public static void thirdDay(){ //states the third day, calls third gift method.
        System.out.println("On the third day of \"Xmas\" my true love gave to me");
        frenchHens();
        System.out.println();
    }
    public static void fourthDay(){ //states the fourth day, calls fourth gift method.
        System.out.println("On the fourth day of \"Xmas\" my true love gave to me");
        callingBirds();
        System.out.println();
    }
    public static void fifthDay(){ //states fifth day, calls fifth gift method.
        System.out.println("On the fifth day of \"Xmas\" my true love gave to me");
        goldRings();
        System.out.println();
    }
    public static void sixthDay(){ //states sixth day, calls sixth gift method.
        System.out.println("On the sixth day of \"Xmas\" my true love gave to me");
        geeseLaying();
        System.out.println();
    }
    public static void partridge(){ //first gift sequence.
        System.out.println("a partridge in a pear tree.");
    }
    public static void turtleDoves(){ //second gift method calls on first.
        System.out.println("two turtle doves, and");
        partridge();
    }
    public static void frenchHens(){ //third gift method calls on second.
        System.out.println("three french hens,");
        turtleDoves();
    }
    public static void callingBirds(){ //fourth gift method calls on third.
        System.out.println("four calling birds,");
        frenchHens();
    }
    public static void goldRings(){ //fifth gift method calls on fourth.
        System.out.println("five golden rings,");
        callingBirds();
    }
    public static void geeseLaying(){ //sixth gift method calls on fifth.
        System.out.println("six geese a-laying");
        goldRings();
    }
}
