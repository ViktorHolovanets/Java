package StreamApi.Task1.models;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayInteger {
    private int[] array;

    public ArrayInteger() {
        this.array = IntStream.generate(() -> new Random().nextInt((1999)) - 1000).limit(50).toArray();
    }

    public long countPositive() {
        return Arrays.stream(array).filter(item -> item > 0).count();
    }

    public long countNegative() {
        return Arrays.stream(array).filter(item -> item < 0).count();
    }

    public long countTwoDigit() {
        return Arrays.stream(array).filter(item -> item > 9 && item < 100).count();
    }
    public long countMirror() {
        return Arrays.stream(array).filter(item ->getReversedNum(item)).count();
    }

    public boolean getReversedNum(int num) {
        if(num<10)
            return false;
        int temp = num;
        var result = 0;
        while (num != 0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }

        return temp==result?true:false;
    }

}
