package OOP.Task2.models;

import lombok.Data;

@Data
public abstract class Animal implements Runnable{
    protected String name;
    public  Animal(){
        this("Animal");
    }
    public Animal(String name){
        this.name=name;
    }
    public abstract void voice();
}
