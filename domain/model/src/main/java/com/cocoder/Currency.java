package com.cocoder;


public class Currency {

    private CurrencyPair from;
    private CurrencyPair to;
    private double amount;
    private double conversion;

    public Currency(CurrencyPair from, CurrencyPair to, double amount, double conversion) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.conversion = conversion;
    }

    public CurrencyPair getFrom() {
        return from;
    }

    public void setFrom(CurrencyPair from) {
        this.from = from;
    }

    public CurrencyPair getTo() {
        return to;
    }

    public void setTo(CurrencyPair to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                ", conversion=" + conversion +
                '}';
    }
}
