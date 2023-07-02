package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    double memory = 0;

    public void switchDisplayMode() {
    }

    public double sine(double sciNum) {
        return Math.sin(sciNum);
    }

    public double cosine(double sciNum) {

        return Math.cos(sciNum);
    }

    public double tangent(double sciNum) {
        return Math.tan(sciNum);
    }

    public double arcSine(double sciNum) {
        return Math.asin(sciNum);
    }

    public double arcCosine(double sciNum) {
        return Math.acos(sciNum);
    }

    public double arcTangent(double sciNum) {
        return Math.atan(sciNum);
    }

    public double toRadians(double sciNum) {
        return Math.toRadians(sciNum);
    }

    public double toDegrees(double sciNum) {
        return Math.toDegrees(sciNum);
    }

    public double Log(double sciNum) {
        return Math.log10(sciNum);
    }

    public double natLog(double sciNum) {
        return Math.log(sciNum);
    }

    public double inverseLog(double sciNum) {
        return Math.pow(10, sciNum);
    }

    public double factorial(double sciNum) {

        int factorial = (int) Math.round(sciNum);

        for (int i = 1; i <= sciNum; i++) {
            factorial *= i;

        }
        return factorial;

    }

}
