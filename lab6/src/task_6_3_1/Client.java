package task_6_3_1;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = TextEditor.getInstance();
        String text = textEditor.readFile("src/task_6_3_1/textfile.txt");
        System.out.println(text);
        textEditor.writeToFile("src/task_6_3_1/outputfile.txt", "Hello world!");
        text = textEditor.readFile("src/task_6_3_1/outputfile.txt");
        System.out.println(text);
    }
}
