package ru.netology;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class сreditСalculatorTest {
    CreditСalculator creditСalculator = null;

    @BeforeEach
    public void init() {
        creditСalculator = new CreditСalculator(800_000, 12, 30);
    }

    @org.junit.jupiter.api.Test
    void monthlyPayment() {

        //arrange
        double expected = 30_998.50;

        //act
        double result = creditСalculator.monthlyPayment();

        //assert
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void amountRefundBank() {


        //arrange
        double expected = 929_955.00;

        //act
        double result = creditСalculator.amountRefundBank();

        //assert
        assertEquals(expected, result);

    }

    @org.junit.jupiter.api.Test
    void overpaymentsEntirePeriod() {

        //arrange
        double expected = 129_955.00;

        //act
        double result = creditСalculator.overpaymentsEntirePeriod();

        //assert
        assertEquals(expected, result);
    }
}