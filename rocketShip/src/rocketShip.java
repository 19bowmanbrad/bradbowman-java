import javax.naming.SizeLimitExceededException;
/*
Brad Bowman
AP Computer Science Period 1
Rocket Ship Project
 */

public class rocketShip {
    public static final int SIZE = 8; //scales figure

    public static void main(String[] args) {
        topSectionHalfOne();
        connecter();
        topMidSection();
        bottomMidSection();
        connecter();
        bottomMidSection();
        topMidSection();
        connecter();
        topSectionHalfOne();
    }

    public static void connecter() {
        for (int i = 0; i < 1; i++) {
            System.out.print("+"); //prints outer plus symbol
            for (int j = 0; j < SIZE * 2; j++) { //prints "=*" for SIZE * 2 times
                System.out.print("=*");
            }
            System.out.println("+"); //closes connecter with plus symbol
        }
    }

    public static void topMidSection() {
        for (int i = 1; i <= SIZE; i++) { //everything in this loop will run SIZE times
            System.out.print("|"); //opens section
            for (int k = 1; k <= 2; k++) { //does both halves of figure by repeating whole process twice
                for (int j = 0; j < SIZE - i; j++) { //These loops print the dots and slashes
                    System.out.print(".");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/\\");
                }
                for (int j = 0; j < SIZE - i; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|"); //closes section, new line
        }
    }

    public static void bottomMidSection() {
        for (int i = SIZE; i >= 1; i--) { //everything in this loop will run SIZE times
            System.out.print("|"); //opens section
            for (int k = 0; k < 2; k++) { //does both halves of figure by repeating whole process twice
                for (int j = 0; j < SIZE - i; j++) { //These loops print the dots and slashes
                    System.out.print(".");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("\\/");
                }
                for (int j = 0; j < SIZE - i; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|"); //closes section, new line
        }
    }

    public static void topSectionHalfOne() {
        for (int i = 1; i <= (SIZE * 2 - 1); i++) { //runs entirety of code SIZE * 2 - 1 times
            System.out.print(" "); //centers cone
            for (int k = 1; k <= (SIZE * 2 - 1) - i; k++) { //correct spacing before slashes start
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { //slashes printed
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 1; j <= i; j++) { //backslashes printed
                System.out.print("\\");
            }
            System.out.println(); //new line
        }
    }
}

