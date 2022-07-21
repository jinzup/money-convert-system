import entities.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static Scanner read(){return new Scanner(System.in);}

    public static void main(String[] args) {

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = read().nextDouble();
        System.out.println("How many dollars will be bought?");
        CurrencyConverter.dollarBought = read().nextDouble();
        System.out.println("Amount to be paid in Reais = R$" +
                String.format("%.2f",CurrencyConverter.currencyCalculator()));
    }
}
