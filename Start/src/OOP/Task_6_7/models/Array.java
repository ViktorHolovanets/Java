package OOP.Task_6_7.models;

import OOP.Task_6_7.interfaces.IMath;
import OOP.Task_6_7.interfaces.ISort;
import lombok.Data;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

@Data
public class Array implements IMath, ISort {
    //    public Array(int[] value){
//        this.array=value;
//    }
//    public Array(){
//        this.array= IntStream.generate(() -> new Random().nextInt(50) - 25).limit(30).toArray();
//    }
//    private int[] array;
    @Override
    public int Max(int[] value) {
        return Arrays.stream(value).max().getAsInt();
    }

    @Override
    public int Min(int[] value) {
        return Arrays.stream(value).min().getAsInt();
    }

    @Override
    public float Avg(int[] value) {
        int sum = 0;
        for (int n : value) {
            sum += n;
        }
        return (float) sum / value.length;
    }

    @Override
    public int[] SortAsc(int[] value) {
        Arrays.sort(value);
        return value;
    }

    @Override
    public int[] SortDesc(int[] value) {
        Arrays.sort(value);
        int size=value.length;
        int[] b = new int[size];
        int j = size;
        for (int i = 0; i < size; i++) {
            b[j - 1] = value[i];
            j = j - 1;
        }
        value = b;
        return value;
    }
}
