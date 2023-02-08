package OOP.Task2.models;

public class Tiger extends Animal{
    public Tiger(){
        super("Tiger");
    }
    public Tiger(String name){
        super(name);
    }
    @Override
    public void voice() {
        System.out.printf("The voice of %s the tiger",this.name);
    }

    @Override
    public void run() {
        System.out.printf("Running tiger %s",this.name);
    }
}
