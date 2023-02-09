import OOP.Task1.models.BaseClasses.Human;
import OOP.Task1.models.Builder;


public class Main {
    public static void main(String[] args) {

      Human builder=new Builder("q","q",12,"Rank");
       var t=new Human();

//        Work.WorkOfHuman(builder);
//        Work.WorkOfHuman(t);

        builder.run();
        t.run();


    }

}