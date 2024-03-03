package task_3_1.DrinkMachine;

import task_3_1.Drinks.Drinkable;

public abstract class DrinkMachine {
    public abstract Drinkable makeDrink(DrinkType drinkType, int sugar);
}
