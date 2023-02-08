package OOP.Task2.models;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super("Kangaroo");
    }

    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.printf("voice of %s", this.name);
    }

    @Override
    public void run() {
        System.out.printf("%s  runs", this.name);
    }
}
