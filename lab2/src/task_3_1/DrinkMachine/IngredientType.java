package task_3_1.DrinkMachine;

public enum IngredientType {
    MILK,
    ICECUBE,
    SUGAR,
    WATER,
    COFFEE;

    private static double milkPrice = 10;
    private static double coffeeBeansPrice = 5;
    private static double iceCubePrice = 1;
    private static double sugarPrice = 5;
    private static double waterPrice = 5;

    public double getPrice(){
        return switch (this) {
            case MILK -> milkPrice;
            case COFFEE -> coffeeBeansPrice;
            case ICECUBE -> iceCubePrice;
            case SUGAR -> sugarPrice;
            case WATER -> waterPrice;
        };
    }

    public static void setPrice(IngredientType ingredientType, int price) {
        switch (ingredientType) {
            case MILK -> milkPrice = price;
            case COFFEE -> coffeeBeansPrice = price;
            case ICECUBE -> iceCubePrice = price;
            case SUGAR -> sugarPrice = price;
            case WATER -> waterPrice = price;
        }
    }
}
