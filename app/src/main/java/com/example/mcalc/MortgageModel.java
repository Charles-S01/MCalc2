package com.example.mcalc;

public class MortgageModel
{
    String p;
    String a;
    String i;

    public MortgageModel (String p, String a, String i)
    {
        this.p = p;
        this.a = a;
        this.i = i;
    }

    public String computePayment()
    {
        double iD = Double.parseDouble(i);
        double r = (iD/100) / 12;

        double aD = Double.parseDouble(a);
        double n = aD*12;

        double pD = Double.parseDouble(p);
        double payment = (r*pD) / (1-(Math.pow((1+r), -n)));

        return String.format("$%.2f", payment);
    }
}
