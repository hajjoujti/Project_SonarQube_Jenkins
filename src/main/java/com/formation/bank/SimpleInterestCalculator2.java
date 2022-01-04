package com.formation.bank;

public class SimpleInterestCalculator2 implements InterestCalculator {

    private double rate;

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate(double amount, double year) {
        if(amount < 0 || year < 0) {
            throw new IllegalArgumentException("Le monmtant et la duree doivent etre positifs");
        }
        return amount * year * rate;
    }

}
