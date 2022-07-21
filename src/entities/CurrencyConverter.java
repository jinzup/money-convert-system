package entities;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double dollarBought;
    public static double currencyCalculator(){
        double reaisNeeded = dollarBought * dollarPrice;
        return  reaisNeeded + (reaisNeeded * 0.06);
    }
}
