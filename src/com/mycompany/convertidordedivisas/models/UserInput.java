package com.mycompany.convertidordedivisas.models;

public class UserInput {

    private int conversionOption;
    private double amountToConvert;
    private String sourceCurrency;
    private String targetCurrency;

    public int getConversionOption() {
        return conversionOption;
    }

    public void setConversionOption(int conversionOption) {
        this.conversionOption = conversionOption;
    }

    public double getAmountToConvert() {
        return amountToConvert;
    }

    public void setAmountToConvert(double amountToConvert) {
        this.amountToConvert = amountToConvert;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    // Method to set rates based on user's selected option
    public void setRates(int conversionOption) {
        switch (conversionOption) {
            case 1:
                this.sourceCurrency = "USD";
                this.targetCurrency = "ARS"; // US Dollar to Argentine Peso
                break;
            case 2:
                this.sourceCurrency = "ARS";
                this.targetCurrency = "USD"; // Argentine Peso to US Dollar
                break;
            case 3:
                this.sourceCurrency = "USD";
                this.targetCurrency = "BOB"; // US Dollar to Bolivian Boliviano
                break;
            case 4:
                this.sourceCurrency = "BOB";
                this.targetCurrency = "USD"; // Bolivian Boliviano to US Dollar
                break;
            case 5:
                this.sourceCurrency = "USD";
                this.targetCurrency = "CLP"; // US Dollar to Chilean Peso
                break;
            case 6:
                this.sourceCurrency = "CLP";
                this.targetCurrency = "USD"; // Chilean Peso to US Dollar
                break;
            case 7:
                this.sourceCurrency = "USD";
                this.targetCurrency = "MXN"; // US Dollar to Mexican Peso
                break;
            case 8:
                this.sourceCurrency = "MXN";
                this.targetCurrency = "USD"; // Mexican Peso to US Dollar
                break;
            default:
                this.sourceCurrency = "Unknown";
                this.targetCurrency = "Unknown"; // Default case for invalid options
                System.out.println("Opción inválida. Por favor ingrese un número del 1 al 9."); // Notification
                break;
        }
    }
}
