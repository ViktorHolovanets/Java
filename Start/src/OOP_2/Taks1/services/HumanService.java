package OOP_2.Taks1.services;

import OOP_2.Taks1.models.Human;

public class HumanService {
    public static void Show(Human human){
        System.out.println("This is show of human");
        System.out.printf("Full name: %s %s\n Age: %d\n",human.getFirstName(),human.getLastName(),human.getAge());
    }
    public  static void Store(Human human){
        System.out.println("Storable of human");
    }
}
