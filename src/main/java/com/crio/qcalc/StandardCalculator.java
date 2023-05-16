package com.crio.qcalc;

public class StandardCalculator {

    protected double result = 0;

    public double getResult() {
        return result;
    }

    public void setResult(double value) {
        this.result = value;
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result: " + result);
    }

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }


    public final void add(int num1, int num2) {
        result = (double)num1 + num2;
    }


    public void add(double num1, double num2) {
        result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");
    
        }
    }


    public void subtract(int num1, int num2) {
        result = (double)num1 - num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");
    
        }
    }

    public void multiply(int num1, int num2) {
        result = (double)num1 * num2;
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");
    
        }
    }

    public void divide(int num1, int num2) {
        if(num2 == 0) throw new ArithmeticException("Divide by zero");
        result = (double)num1 / num2;
    }

    public void divide(double num1, double num2) {
        if(num2 == 0) throw new ArithmeticException("Divide by zero");
        
        result = num1 / num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || (num2 ==0)){

            throw new ArithmeticException("Double overflow");
    
        }
    }

    // public static void main(String[] args) {

    // }
}
