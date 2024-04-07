package task_10_3_1;

interface Printable {
    void print();
}

class PrintableString implements Printable {
    private String text;

    public PrintableString(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }
}

abstract class StringDecorator implements Printable {
    protected Printable printable;

    public StringDecorator(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
    }
}

class PostComaDecorator extends StringDecorator {
    public PostComaDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}

class PostEndlDecorator extends StringDecorator {
    public PostEndlDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.println();
    }
}

class PostSpaceDecorator extends StringDecorator {
    public PostSpaceDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}

class PostExclaimDecorator extends StringDecorator {
    public PostExclaimDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}

class PostWordDecorator extends StringDecorator {
    private String word;

    public PostWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}

class PreWordDecorator extends StringDecorator {
    private String word;

    public PreWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Printable printable = new PrintableString("");
        printable = new PreWordDecorator(printable, "Hello");
        printable = new PostComaDecorator(printable);
        printable = new PostSpaceDecorator(printable);
        printable = new PostWordDecorator(printable, "World");
        printable = new PostExclaimDecorator(printable);
        printable = new PostEndlDecorator(printable);
        printable.print();
    }
}
