package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		// System.out.println("Finally Code is Running.........");
		StandardCalculator calc = new StandardCalculator();
		
		calc.add(18, 9);
		System.out.println(calc.getResult());
		calc.add(1.8, 0.9);
		System.out.println(calc.getResult());
		
		calc.subtract(18,9);
		System.out.println(calc.getResult());
		calc.subtract(1.8, 0.9);
		System.out.println(calc.getResult());

		calc.multiply(18, 9);
		System.out.println(calc.getResult());
		calc.multiply(1.8, 0.9);
		System.out.println(calc.getResult());

		calc.divide(18, 9);
		System.out.println(calc.getResult());
		calc.divide(1.8, 0.9);
		System.out.println(calc.getResult());
	}

}
