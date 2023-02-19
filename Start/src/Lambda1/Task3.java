package Lambda1;

import java.util.function.Predicate;

public class Task3 implements Runnable {
    @Override
    public void run() {
        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        Predicate<Integer> isPositive=x -> x > 0;
        Predicate<Integer> isNegative=x -> x < 0;
        Predicate<Integer> isRange=x -> x < 10&&x>0;
        Predicate<Integer> isisEven=x -> x == 0;


    }
    public int sum(int[] numbers, Predicate<Integer> func){
        int result = 0;
        for(int i : numbers)
        {
            if (func.test(i))
                result += i;
        }
        return result;
    }

}
