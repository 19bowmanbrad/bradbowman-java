/*
 *****************************************************
 * Name: Brad Bowman
 * AP CS A
 * Period 1
 * Date:
 * fracCalc
 *****************************************************
 */
import javax.swing.*;
import java.util.*;
public class fracCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        Scanner mathStuff = new Scanner (System.in);
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
            System.out.println("Enter an equation");
            String userEquation;
            userEquation = mathStuff.nextLine();
            Character testChar;
            String fracOne = "";
            String sign = "";
            String fracTwo = "";
            String[] splitArray = userEquation.split(" ");
            fracOne = splitArray[0];
            sign = splitArray[1];
            fracTwo = splitArray[2];
            System.out.println(fracOne);
            System.out.println(sign);
            System.out.println(fracTwo);
            int wholeNum = parseWhole(fracOne);
            System.out.println(wholeNum);
            int numeNum = parseNume(fracOne);
            System.out.println(numeNum);
            int denomNum = parseDenom(fracOne);
            System.out.println(denomNum);
            int wholeNum2 = parseWhole(fracTwo);
            System.out.println(wholeNum2);
            int numeNum2 = parseNume(fracTwo);
            System.out.println(numeNum2);
            int denomNum2 = parseDenom(fracTwo);
            System.out.println(denomNum2);

//            for (int i = 0; i < userEquation.length(); i ++) {
//                testChar = userEquation.charAt(i);
//                System.out.println(testChar);
//                if (testChar.equals(" ")) {
//                    fracOne = (userEquation.substring(0, i));
//                    i++;
//                }
//            }
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
        int wholeNum = 0;
        Character testChar;
        for (int i = 0; i < fraction.length(); i++){
            testChar = fraction.charAt(i);
            if (testChar == '_'){
                wholeNum = Integer.parseInt(fraction.substring(0, i));
            }
        }
        return wholeNum;
    }

    public static int parseNume(final String fraction) {
        System.out.println("parseNume");
        int numeNum = 0;
        Character testChar;
        for (int i = 0; i < fraction.length(); i++){
            testChar = fraction.charAt(i);
            if (testChar == '_'){
                for (i = i; i < fraction.length(); i++) {
                    testChar = fraction.charAt(i);
                    if (testChar == '/') {
                        numeNum = Integer.parseInt(fraction.substring((fraction.indexOf('_') + 1), i));
                    }
                }
            } else{
                if (testChar == '/') {
                    numeNum = Integer.parseInt(fraction.substring(0, i));
                }
            }
        }
        return numeNum;
    }

    public static int parseDenom(final String fraction) {
        System.out.println("parseDenom");
        int denomNum = 1;
        Character testChar;
        for (int i = 0; i < fraction.length(); i++){
            testChar = fraction.charAt(i);
            if (testChar == '_'){
                for (i = i; i < fraction.length(); i++) {
                    testChar = fraction.charAt(i);
                    if (testChar == '/') {
                        denomNum = Integer.parseInt(fraction.substring((fraction.indexOf(testChar) + 1)));
                    }
                }
            } else{
                if (testChar == '/') {
                    denomNum = Integer.parseInt(fraction.substring((fraction.indexOf(testChar) + 1)));
                }
            }
        }
        return denomNum;
    }
}
