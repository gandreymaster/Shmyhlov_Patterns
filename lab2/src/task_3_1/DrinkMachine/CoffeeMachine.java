package task_3_1.DrinkMachine;

import task_3_1.Drinks.*;

public class CoffeeMachine extends DrinkMachine {
    @Override
    public Drinkable makeDrink(DrinkType drinkType, int sugar) {
        Drinkable drink;

        if (drinkType instanceof CoffeeType) {
            switch ((CoffeeType) drinkType) {
                case ESPRESSO -> {
                    drink = new Espresso(sugar);
                    System.out.println("Serving espresso. Drink price: " + drink.getPrice());
                    return drink;
                }
                case AMERICANO -> {
                    drink = new Americano(sugar);
                    System.out.println("Serving americano. Drink price: " + drink.getPrice());
                    return drink;
                }
                case CAPPUCCINO -> {
                    drink = new Cappuccino(sugar);
                    System.out.println("Serving cappuccino. Drink price: " + drink.getPrice());
                    return drink;
                }
                case LATTE -> {
                    drink = new Latte(sugar);
                    System.out.println("Serving latte. Drink price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
