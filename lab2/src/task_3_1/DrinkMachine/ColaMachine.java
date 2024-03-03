package task_3_1.DrinkMachine;

import task_3_1.Drinks.*;

public class ColaMachine extends DrinkMachine {
    @Override
    public Drinkable makeDrink(DrinkType drinkType, int sugar) {
        Drinkable drink;

        if (drinkType instanceof ColaType) {
            switch ((ColaType) drinkType) {
                case PEPSICOLA -> {
                    drink = new PepsiCola();
                    System.out.println("Serving PepsiCola. Drink price: " + drink.getPrice());
                    return drink;
                }
                case COCACOLA -> {
                    drink = new CocaCola();
                    System.out.println("Serving CocaCola. Drink price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
