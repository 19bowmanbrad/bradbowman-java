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

            System.out.println("Enter an equation");

            String userEquation;
            userEquation = mathStuff.nextLine();

            String fracOne;

            String sign;

            String fracTwo;

            String[] splitArray = userEquation.split(" ");

            fracOne = splitArray[0];
            sign = splitArray[1];
            fracTwo = splitArray[2];
//            System.out.println(fracOne);
//            System.out.println(sign);
//            System.out.println(fracTwo);

            int wholeNum = parseWhole(fracOne);
//            System.out.println(wholeNum);

            int numeNum = parseNume(fracOne);
//            System.out.println(numeNum);

            int denomNum = parseDenom(fracOne);
//            System.out.println(denomNum);

            int wholeNum2 = parseWhole(fracTwo);
//            System.out.println(wholeNum2);

            int numeNum2 = parseNume(fracTwo);
//            System.out.println(numeNum2);

            int denomNum2 = parseDenom(fracTwo);
//            System.out.println(denomNum2);

            if (sign.equals("+")){
                String addFracs = add(wholeNum, numeNum, denomNum, wholeNum2, numeNum2, denomNum2);
                System.out.println(fracOne + " " + sign + " " + fracTwo + " = " + addFracs);
            } else if (sign.equals("-")){
                String subtractFracs = subtract(wholeNum, numeNum, denomNum, wholeNum2, numeNum2, denomNum2);
                System.out.println(fracOne + " " + sign + " " + fracTwo + " = " + subtractFracs);
            } else if (sign.equals("*")){
                String multiplyFracs = multiply(wholeNum, numeNum, denomNum, wholeNum2, numeNum2, denomNum2);
                System.out.println(fracOne + " " + sign + " " + fracTwo + " = " + multiplyFracs);
            } else if (sign.equals("/")){
                String divideFracs = divide(wholeNum, numeNum, denomNum, wholeNum2, numeNum2, denomNum2);
                System.out.println(fracOne + " " + sign + " " + fracTwo + " = " + divideFracs);
            } else {
                System.out.println("ERROR: SIGN NOT RECOGNIZED");
            }



            System.out.println("Would you like to continue using the calculator? -y -n");
            yesNo = userInput.next();

        }

    }
    public static String add(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {
//        System.out.println("add");
        if (firstWhole != 0){
            firstNume = ((firstWhole * firstDenom) + firstNume);
        }
        if (secondWhole != 0){
            secondNume = ((secondWhole * secondDenom) + secondNume);
        }
        int finalNume = ((firstNume * secondDenom) + (firstDenom * secondNume));
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume % finalDenom == 0){
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return (finalNume + "/" + finalDenom);
        }

    }
    public static String subtract(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {
//        System.out.println("subtract");
        if (firstWhole != 0){
            firstNume = ((firstWhole * firstDenom) + firstNume);
        }
        if (secondWhole != 0){
            secondNume = ((secondWhole * secondDenom) + secondNume);
        }
        int finalNume = ((firstNume * secondDenom) - (firstDenom * secondNume));
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume % finalDenom == 0){
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return (finalNume + "/" + finalDenom);
        }
    }

    public static String multiply(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {
//        System.out.println("multiply");
        if (firstWhole != 0){
            firstNume = ((firstWhole * firstDenom) + firstNume);
        }
        if (secondWhole != 0){
            secondNume = ((secondWhole * secondDenom) + secondNume);
        }
        int finalNume = (firstNume * secondNume);
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume % finalDenom == 0){
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return (finalNume + "/" + finalDenom);
        }
    }

    public static String divide(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {
//        System.out.println("divide");
        if (firstWhole != 0){
            firstNume = ((firstWhole * firstDenom) + firstNume);
        }
        if (secondWhole != 0){
            secondNume = ((secondWhole * secondDenom) + secondNume);
        }
        int finalNume = (firstNume * secondDenom);
        int finalDenom = (firstDenom * secondNume);
        if (finalNume % finalDenom == 0){
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return (finalNume + "/" + finalDenom);
        }
    }

    public static int parseWhole(final String fraction) {
//        System.out.println("parseWhole");
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
//        System.out.println("parseNume");
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
//        System.out.println("parseDenom");
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
