package task_3_1.Drinks;

import task_3_1.DrinkMachine.IngredientType;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Latte extends Drinkable {
    private static final int basePrice = 20;
    private static final Dictionary<IngredientType, Double> ingredients = new Hashtable<>() {
        {
            put(IngredientType.WATER, 0.5);
            put(IngredientType.COFFEE, 0.1);
            put(IngredientType.MILK, 0.4);
        }
    };

    public Latte(int sugar) {
        this.sugar = Math.max(sugar, 0);
    }

    @Override
    public double getPrice(){
        double ingredientPrice = 0.0;
        Enumeration<IngredientType> ingredientTypeEnumeration = ingredients.keys();
        while (ingredientTypeEnumeration.hasMoreElements()){
            IngredientType ingredient = ingredientTypeEnumeration.nextElement();
            ingredientPrice += ingredient.getPrice() * ingredients.get(ingredient);
        }

        return basePrice + ingredientPrice + sugar * IngredientType.SUGAR.getPrice();
    }
}
