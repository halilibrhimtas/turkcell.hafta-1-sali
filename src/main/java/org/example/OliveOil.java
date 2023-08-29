package org.example;

public class OliveOil extends Ingredient{
    private String fatValue;

    public String getFatValue() {
        return fatValue;
    }

    public void setFatValue(String fatValue) {
        this.fatValue = fatValue;
    }

    @Override
    String cookMinutes() {
        return "Averages cook: 3 minutes ";
    }
}
