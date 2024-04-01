package task_9_3_1;

public class ExpensesClient {

    public static void main(String[] args) {
        SalesTeam supermarket = new SalesTeam();

        Manager manager = new Manager("Andrey", 3000);
        supermarket.addEmployee(manager);

        Manager manager1 = new Manager("Lord",2500);
        SalesTeam team1 = new SalesTeam();
        team1.addEmployee(manager);
        Salesperson salesperson11 = new Salesperson("Robert", 1000, manager1);
        team1.addEmployee(salesperson11);
        Salesperson salesperson12 = new Salesperson("Ihor", 890, manager1);
        team1.addEmployee(salesperson12);
        Salesperson salesperson13 = new Salesperson("Bob", 1100, manager1);
        team1.addEmployee(salesperson13);
        supermarket.addEmployee(team1);

        Manager manager2 = new Manager("Director",2500);
        SalesTeam team2 = new SalesTeam();
        team2.addEmployee(manager);
        Salesperson salesperson21 = new Salesperson("Lol", 700, manager2);
        team2.addEmployee(salesperson21);
        Salesperson salesperson22 = new Salesperson("Rofl", 500, manager2);
        team2.addEmployee(salesperson22);
        Salesperson salesperson23 = new Salesperson("Kolobok", 800, manager2);
        team2.addEmployee(salesperson23);
        supermarket.addEmployee(team2);

        supermarket.payExpenses();
    }

}
