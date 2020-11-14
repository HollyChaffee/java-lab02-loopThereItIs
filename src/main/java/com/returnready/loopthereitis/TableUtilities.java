package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";

        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
              result = result + String.format("%3d |",c*r);
            }
            result += "\n";
        }
        return result;
    }


    public static String getLargeMultiplicationTable() {
        String result = "";

        for (int r = 1; r <= 10; r++) {
            for (int c = 1; c <= 10; c++) {
                result = result + String.format("%3d |",c*r);
            }
            result += "\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";

        for (int r = 1; r <= tableSize; r++) {
            for (int c = 1; c <= tableSize; c++) {
                result = result + String.format("%3d |",c*r);
            }
            result += "\n";
        }
        return result;
    }
}
