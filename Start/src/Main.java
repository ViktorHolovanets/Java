import Array.Task1.models.Array;
import OOP.Task1.models.BaseClasses.Human;
import OOP.Task1.models.Builder;
import OOP_2.Task4.models.Fraction;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Array a= new Array(new int[]{16,12,3,4});
        System.out.println(Arrays.toString(a.array));
        System.out.println(a.binarySearch(5));
        System.out.println(Arrays.toString(a.array));

    }

}