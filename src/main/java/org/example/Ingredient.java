package org.example;

public abstract class Ingredient {
    private String ingredientName;
    private int amount;
    private String ingredientType;

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    abstract String cookMinutes();

    public void calorieCalculate(Integer amount){
        System.out.println(amount*100);
    }

    public void calorieCalculate(Integer amount, Integer calorie){
        System.out.println(amount*calorie);
    }
}
