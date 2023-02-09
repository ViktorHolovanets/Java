package OOP_2.Taks1.models;

import lombok.Data;

@Data
public class Human {
    public Human(){
        this("Viktor","Holovanets",31);
    }
    public Human(String firstName, String lastName, Integer age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    protected String firstName;
    protected String lastName;
    protected Integer age;

}
