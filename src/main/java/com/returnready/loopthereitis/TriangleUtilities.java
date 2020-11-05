package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = new String();
        for(int row = 0; row < numberOfRows-1; row++) {
            for(int col = 0; col <= row; col++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String row = new String();
        for(int i = 0; i < numberOfStars; i++ ){
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        String triangle = new String();
        for(int row = 0; row < 4; row++) {
            for(int col = 0; col <= row; col++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = new String();
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col <= row; col++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    }

