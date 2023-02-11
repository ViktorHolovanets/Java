package Array.Task1.models;

import Array.Task1.interfaces.IMath;
import Array.Task1.interfaces.ISearch;
import Array.Task1.interfaces.ISort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Array implements IMath, ISort, ISearch {
    private int[]array;
    private   int size;
    public Array(){

    }
    public Array(int s,int max, int min){
        this.size=s;
        int finalMax = Math.abs(max);
        int finalMin = Math.abs(min);
        this.array= IntStream.generate(() -> new Random().nextInt((finalMax + finalMin)) - finalMin).limit(s).toArray();
    }
    public Array(int s){
        this(s,25,-25);
    }
    public Array(int[] array){
        this.size=array.length;
        this.array=array;
    }

    @Override
    public int Max(int[] value)  {
        return Arrays.stream(value).max().getAsInt();
    }

    @Override
    public int Max() {
        return Max(this.array);
    }

    @Override
    public int Min(int[] value)  {
        return Arrays.stream(value).min().getAsInt();
    }

    @Override
    public int Min() {
        return Min(this.array);
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
    public float Avg() {
        return this.Avg(this.array);
    }

    @Override
    public int[] SortAsc(int[] value) {
        Arrays.sort(value);
        return value;
    }

    @Override
    public int[] SortAsc() {
        return SortAsc( this.array);
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

    @Override
    public int[] SortDesc() {
        return SortDesc(this.array);
    }

    @Override
    public int binarySearch(int item) {
        var temp=array.clone();
        SortAsc(temp);
        int first = 0;
        int last = size - 1;
        int position= (first + last) / 2;
        while ((temp[position] != item) && (first <= last)) {
            if (temp[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        return (first <= last)?position:-1;
    }
    public void swap(int position, int item){
        if(position>-1&& position<size){
            array[position]=item;
        }
    }
    public void show(){
        System.out.println(Arrays.toString(array));
    }
}
