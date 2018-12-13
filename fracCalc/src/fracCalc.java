/*
 *****************************************************
 * Name: Brad Bowman
 * AP CS A
 * Period 1
 * Date:
 * fracCalc
 *****************************************************
 */
import java.util.*;
public class fracCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Would you like to use the calculator? -y -n");
        String yesNo = userInput.next();
        while (yesNo.equals("y")){
            add(1,2,3,4);
            subtract(1,2,3,4);
            multiply(1,2,3,4);
            divide(1,2,3,4);
            parseWhole("");
            parseNume("");
            parseDenom("");
            System.out.println("Would you like to continue using the calculator? -y -n");
            yesNo = userInput.next();
        }

    }
    public static String add(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        System.out.println("add");
        return "";
    }
    public static String subtract(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        System.out.println("subtract");
        return "";
    }

    public static String multiply(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        System.out.println("multiply");
        return "";
    }

    public static String divide(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        System.out.println("divide");
        return "";
    }

    public static int parseWhole(final String fraction) {
        System.out.println("parseWhole");
        return 0;
    }

    public static int parseNume(final String fraction) {
        System.out.println("parseNume");
        return 0;
    }

    public static int parseDenom(final String fraction) {
        System.out.println("parseDenom");
        return 0;
    }
}


