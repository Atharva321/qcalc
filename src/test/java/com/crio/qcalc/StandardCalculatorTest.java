package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    // Addition Operation Tests
    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.8,0.9);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.7, actualResult);
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }


    // Substraction Operation Tests
    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        int actualResult = (int)standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(1.8,0.9);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0.9, actualResult);
    }
        
    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }


    // Multiplication Operation Tests
    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(9,9);
        int actualResult = (int)standardCalculator.getResult();
        Assertions.assertEquals(81, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Doubles")
    void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply(1.8,0.9);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(1.62, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE , Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles in which One is Positive and Other is Negative")
    void testMultiplicationOverflowForDoublesOnePosOtherNeg(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    // Division Operation Tests
    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(1,1);
        int actualResult = (int)standardCalculator.getResult();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Doubles")
    void testDivisionOperationForDoubles(){
        standardCalculator.divide(1.8,0.9);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.0, actualResult);
    }

    // @Test
    // @DisplayName("Test Division Overflow of Two Doubles")
    // void testDivisionOverflowForDoubles(){
    //     //Assert
    //     Assertions.assertThrows(ArithmeticException.class,new Executable(){
    //         @Override
    //         public void execute() throws Throwable{
    //             standardCalculator.divide( Double.MAX_VALUE, );
    //         }
    //     });
    // }

    @Test
    @DisplayName("Test Division by 0 of Two Numbers")
    void testDivisionByZeroOverflowForDoubles(){
        // Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.divide( 1 , 0);
            }
        });
    }
}