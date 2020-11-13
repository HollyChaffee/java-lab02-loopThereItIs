package com.returnready.loopthereitis;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop, int step) {
        String evenNumbers = "";
        for (int index = start; index < stop; index += step) {
            if (index % 2 == 0) {
                evenNumbers = evenNumbers + index;
            }
        }
        return evenNumbers;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int index = start; index < stop; index++) {
            if (index % 2 !=0) {
                oddNumbers = oddNumbers + index;

            }
        }
        return oddNumbers;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int index = start ; index < stop; index += step) {
            squareNumbers += index * index;
        }
        return squareNumbers;
    }

    public static String getRange(int stop) {
        String Range1 = "";
        for (int Index = 0; Index < stop - 1; Index++) {
            Range1 = Range1 + Index;
        }
        return Range1;
    }

    public static String getRange(int start, int stop) {
        String Range2 = "";
        for (int index = start; index < stop; index++) {
            Range2 = Range2 + index;
        }
        return Range2;
    }


    public static String getRange(int start, int stop, int step) {
        String Range3 = "";
        for (int index = start;index  < stop; index = index + step) {
            Range3 = Range3 + index;
        }
        return Range3;

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String Exponentiations = "";
        for (int index = start; index < stop; index = index + step) {

            Exponentiations = Exponentiations + (int) (Math.pow(index, exponent));
        }
        return Exponentiations;
    }
}

