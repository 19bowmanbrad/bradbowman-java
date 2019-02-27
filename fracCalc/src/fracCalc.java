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
        Scanner mathStuff = new Scanner (System.in);
        System.out.println("Would you like to use the calculator? -y -n");
        String yesNo = userInput.next();
        while (yesNo.equals("y")){

            System.out.println("Enter an equation");

            String userEquation = mathStuff.nextLine();

            String fracOne;

            String sign;

            String fracTwo;

            String[] splitArray = userEquation.split(" ");

            fracOne = splitArray[0];
            sign = splitArray[1];
            fracTwo = splitArray[2];


            int wholeNum = 0;
            int numeNum = 1;
            int denomNum = 1;

            int wholeNum2 = 0;
            int numeNum2 = 1;
            int denomNum2 = 1;

            if (fracOne.contains("/")){
                    wholeNum = parseWhole(fracOne);
                    numeNum = parseNume(fracOne);
                    denomNum = parseDenom(fracOne);
            } else {
                    numeNum = Integer.parseInt(fracOne);
            }

            if (fracTwo.contains("/")){
                    wholeNum2 = parseWhole(fracTwo);
                    numeNum2 = parseNume(fracTwo);
                    denomNum2 = parseDenom(fracTwo);
            } else {
                    numeNum2 = Integer.parseInt(fracTwo);
            }


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

        if (firstWhole != 0){
            if (firstWhole < -1){
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
                firstNume = firstNume * -1;
            } else {
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
            }
        }
        if (secondWhole != 0){
            if (secondWhole < -1){
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
                secondNume = secondNume * -1;
            } else {
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
            }
        }
        int finalNume = ((firstNume * secondDenom) + (firstDenom * secondNume));
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume < 0 && finalDenom < 0){
            finalNume = Math.abs(finalNume);
            finalDenom = Math.abs(finalDenom);
        }
        if (finalNume % finalDenom == 0) {
            return (Integer.toString(finalNume / finalDenom));
        }else {
            return simplify(finalNume, finalDenom);
        }

    }
    public static String subtract(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {

        if (firstWhole != 0){
            if (firstWhole < -1){
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
                firstNume = firstNume * -1;
            } else {
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
            }
        }
        if (secondWhole != 0){
            if (secondWhole < -1){
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
                secondNume = secondNume * -1;
            } else {
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
            }
        }
        int finalNume = ((firstNume * secondDenom) - (firstDenom * secondNume));
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume < 0 && finalDenom < 0){
            finalNume = Math.abs(finalNume);
            finalDenom = Math.abs(finalDenom);
        }
        if (finalNume % finalDenom == 0) {
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return simplify(finalNume, finalDenom);
        }
    }

    public static String multiply(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {

        if (firstWhole != 0){
            if (firstWhole < -1){
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
                firstNume = firstNume * -1;
            } else {
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
            }
        }
        if (secondWhole != 0){
            if (secondWhole < -1){
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
                secondNume = secondNume * -1;
            } else {
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
            }
        }
        int finalNume = (firstNume * secondNume);
        int finalDenom = (firstDenom * secondDenom);
        if (finalNume < 0 && finalDenom < 0){
            finalNume = Math.abs(finalNume);
            finalDenom = Math.abs(finalDenom);
        }
        if (finalNume % finalDenom == 0) {
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return simplify(finalNume, finalDenom);
        }
    }

    public static String divide(int firstWhole, int firstNume, int firstDenom, int secondWhole, int secondNume, int secondDenom) {

        if (firstWhole != 0){
            if (firstWhole < -1){
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
                firstNume = firstNume * -1;
            } else {
                firstNume = ((Math.abs(firstWhole) * firstDenom) + firstNume);
            }
        }
        if (secondWhole != 0){
            if (secondWhole < -1){
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
                secondNume = secondNume * -1;
            } else {
                secondNume = ((Math.abs(secondWhole) * secondDenom) + secondNume);
            }
        }
        int finalNume = (firstNume * secondDenom);
        int finalDenom = (firstDenom * secondNume);
        if (finalNume < 0 && finalDenom < 0){
            finalNume = Math.abs(finalNume);
            finalDenom = Math.abs(finalDenom);
        }
        if (finalNume % finalDenom == 0){
            return (Integer.toString(finalNume / finalDenom));
        } else {
            return simplify(finalNume, finalDenom);
        }
    }

    public static int parseWhole(final String fraction) {

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
            } else {
                if (testChar == '/') {
                    numeNum = Integer.parseInt(fraction.substring(0, i));
                }
            }
        }
        return numeNum;
    }

    public static int parseDenom(final String fraction) {

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
            } else {
                if (testChar == '/') {
                    denomNum = Integer.parseInt(fraction.substring((fraction.indexOf(testChar) + 1)));
                }
            }
        }
        return denomNum;
    }

    public static String simplify(int nume, int denom){

        int wholeNum = 0;
        if (Math.abs(nume) > Math.abs(denom)){ //Reduces improper to proper fraction.
            wholeNum = (nume / denom);
            nume = ((nume % denom));
        }
        int gcd = gcd(nume, denom); //Gets greatest common divisor
        nume = nume / gcd; //reduces nume
        denom = denom / gcd; //reduces denom

        if (wholeNum == 0){
            return (nume + "/" + denom);
        } else {
            if (wholeNum < 0){
                nume = Math.abs(nume);
                denom = Math.abs(denom);
                return (wholeNum + "_" + nume + "/" + denom);
            } else {
                return (wholeNum + "_" + nume + "/" + denom);
            }
        }
    }

    public static int gcd(int nume, int denom){ //Finds greatest common divisor

        nume = Math.abs(nume);
        denom = Math.abs(denom);
        if (nume == 0)
            return denom;
        if (denom == 0)
            return nume;

        if (nume == denom)
            return nume;

        if (nume > denom)
            return gcd(nume - denom, denom);
        return gcd(nume, denom - nume);
    }
}
