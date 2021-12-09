package oop_exam_preperation.beans;

import java.text.DecimalFormat;

public class Salary {
    /*
    amount:double (1,000-50,000)
    yearlyBonus:int (0-10,000)
     */
    private double amount;
    private int yearlyBouns;

    public Salary(double amount, int yearlyBouns) {
        setAmount(amount);
        setYearlyBouns(yearlyBouns);
    }

    //for testing we should use the default constructor
    public Salary() {
        String pattern = "######.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        this.amount =  Double.parseDouble( decimalFormat.format(Math.random()*49_000+1_000)); //1,000->50,000
        this.yearlyBouns = (int)(Math.random()*10_000);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getYearlyBouns() {
        return yearlyBouns;
    }

    public void setYearlyBouns(int yearlyBouns) {
        this.yearlyBouns = yearlyBouns;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", yearlyBouns=" + yearlyBouns +
                '}';
    }
}
