package task_10_3_2;

abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 0.99;
    }
}

class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}

abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}

class Sugar extends CondimentDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return 0.05 + beverage.cost();
    }
}

class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}

class Cream extends CondimentDecorator {
    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        // Еспресо з двома порціями цукру
        Beverage beverage1 = new Espresso();
        beverage1 = new Sugar(beverage1);
        beverage1 = new Sugar(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // Чорна кава з вершками та двома порціями цукру
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Whip(beverage2);
        beverage2 = new Sugar(beverage2);
        beverage2 = new Sugar(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Чорна кава з кремом та порцією цукру
        Beverage beverage3 = new DarkRoast();
        beverage3 = new Cream(beverage3);
        beverage3 = new Sugar(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        // Кава без кофеїну з молоком та двома порціями цукру
        Beverage beverage4 = new Decaf();
        beverage4 = new Milk(beverage4);
        beverage4 = new Sugar(beverage4);
        beverage4 = new Sugar(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
    }
}


