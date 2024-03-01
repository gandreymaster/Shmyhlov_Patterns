package task_3_2;

public class task_3_2 {
    public static void main(String[] args) {
        Creator creator1 = new ConreateCreator1();
        creator1.someOperation();
        Creator creator2 = new ConreateCreator2();
        creator2.someOperation();
        System.out.println("Random Creator");
        Creator creator3 = new Creator();
        creator3.someOperation();
        Creator creator4 = new Creator();
        creator4.someOperation();
        Creator creator5 = new Creator();
        creator5.someOperation();
    }
}
