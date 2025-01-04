package com.mycompany.convertidordedivisas;

import com.mycompany.convertidordedivisas.models.ExchangeRateAPI;
import com.mycompany.convertidordedivisas.models.UserInput;
import com.mycompany.convertidordedivisas.services.CurrencyCalculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        UserInput userInput = new UserInput();
        CurrencyCalculator currencyCalculator = new CurrencyCalculator();
        ExchangeRateAPI exchangeRateAPI = new ExchangeRateAPI();

        boolean exit = true;


        System.out.println("** Bienvenido al Conversor de Monedas ** \n");

        while (exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Dólar estadounidense (USD) =>> Peso argentino (ARS)");
            System.out.println("2.- Peso argentino (ARS) =>> Dólar estadounidense (USD)");
            System.out.println("3.- Dólar estadounidense (USD) =>> Boliviano (BOB)");
            System.out.println("4.- Boliviano (BOB) =>> Dólar estadounidense (USD)");
            System.out.println("5.- Dólar estadounidense (USD) =>> Peso chileno (CLP)");
            System.out.println("6.- Peso chileno (CLP) =>> Dólar estadounidense (USD)");
            System.out.println("7.- Dólar estadounidense (USD) =>> Peso mexicano (MXN)");
            System.out.println("8.- Peso mexicano (MXN) =>> Dólar estadounidense (USD)");
            System.out.println("9.- Salir");
            System.out.print("--- ");
            int option = sc.nextInt();

            if (option == 9) {
                System.out.println("Gracias por usar nuestro convertidor de divisas.");
                break;
            }

            userInput.setConversionOption(option);
            userInput.setRates(userInput.getConversionOption());

            System.out.println("Cantidad deseada para convertir:");
            System.out.print("--- ");
            userInput.setAmountToConvert(sc.nextDouble());

            System.out.println(userInput.getAmountToConvert() + " (" + userInput.getSourceCurrency() + ")" + " equivalen a " + exchangeRateAPI.getExchangeRate(userInput) * userInput.getAmountToConvert() + " (" + userInput.getTargetCurrency() + ")");






        }


    }
}