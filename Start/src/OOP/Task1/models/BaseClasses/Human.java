package OOP.Task1.models.BaseClasses;

import lombok.Data;

@Data
public class Human implements Runnable{
    public Human(){
        this("Undefined","Undefined",18);
    }
    public Human(String firstName, String lastName, Integer age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    protected String firstName;
    protected String lastName;
    protected Integer age;

    @Override
    public void run() {
        System.out.println("The work of a human");
    }
}
