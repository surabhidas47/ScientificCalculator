package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    double memory = 0;

    public void switchDisplayMode() {
    }

    //1.Sine
    public double sine(double sciNum) {
        return Math.sin(sciNum);
    }
    //2.Cosine
    public double cosine(double sciNum) {

        return Math.cos(sciNum);
    }
    //3. Tangent
    public double tangent(double sciNum) {
        return Math.tan(sciNum);
    }
    //4. Factorial
    public double factorial(double sciNum) {

        int factorial = (int) Math.round(sciNum);

        for (int i = 1; i <= sciNum; i++) {
            factorial *= i;

        }
        return factorial;

    }

    //5. Inverse Sine
    public double arcSine(double sciNum) {
        return Math.asin(sciNum);
    }

    //6. Inverse Cosine
    public double arcCosine(double sciNum) {
        return Math.acos(sciNum);
    }
    //7.Inverse Tangent
    public double arcTangent(double sciNum) {
        return Math.atan(sciNum);
    }
    //8. Deg to Rad
    public double toRadians(double sciNum) {
        return Math.toRadians(sciNum);
    }

    //9. Log
    public double Log(double sciNum) {
        return Math.log10(sciNum);
    }
    //10.Nat Log
    public double natLog(double sciNum) {
        return Math.log(sciNum);
    }
    //11. Inverse Nat Log
    public double inverseLog(double sciNum) {
        return Math.pow(10, sciNum);
    }

    //12. Rad to Deg
    public double toDegrees(double sciNum) {
        return Math.toDegrees(sciNum);
    }



}
