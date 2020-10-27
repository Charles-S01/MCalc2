package com.example.mcalc;

import org.junit.Test;

public class MortgageModelTest {

    @Test
    public void testPayment()
    {
        MortgageModel myModel;

        myModel = new MortgageModel("700000", "25", "2.75");
        String payment = myModel.computePayment();
        System.out.println(payment);

        myModel = new MortgageModel("300000", "20", "4.50");
        String payment2 = myModel.computePayment();
        System.out.println(payment2);
    }

    @Test
    public void testSumn()
    {
        String x = "4.5";

        double xD = Double.parseDouble(x);
        double r = (xD/100) / 12;
        System.out.println(r);
    }

//    @Test
//    public void testNums()
//    {
//
//    }
}












