package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class QcalcApplication extends StandardCalculator {

    public static void main(String[] args) {
        // SpringApplication.run(QcalcApplication.class, args);
        // System.out.println("Hello world!");
        StandardCalculator calc = new StandardCalculator();
        calc.add(18, 9);
        System.out.println(calc.getResult());
        calc.subtract(18,9);
        System.out.println(calc.getResult());
        calc.multiply(18, 9);
        System.out.println(calc.getResult());
        calc.divide(18, 9);
        System.out.println(calc.getResult());
    }
}