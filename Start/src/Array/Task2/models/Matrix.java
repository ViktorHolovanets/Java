package Array.Task2.models;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Matrix {
    private int[][] array;
    private int sizeX;
    private int sizeY;

    public Matrix(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        this.array = new int[y][x];
    }

    public Matrix() {
        this(10, 10);
        RandomArray2D();
    }

    public void RandomArray2D() {
        for (int i = 0; i < sizeY; i++) {
            array[i] = IntStream.generate(() -> new Random().nextInt(10)).limit(sizeX).toArray();
        }
    }

    public void Show() {
        for (int[] n : array) {
            System.out.println(Arrays.toString(n));
        }
    }

    public void Create() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        sizeY = in.nextInt();
        System.out.print("Enter end column size: ");
        sizeX = in.nextInt();
        array = new int[sizeY][sizeX];
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.printf("Enter value row %d,col %d: ", i, j);
                array[i][j] = in.nextInt();
            }
        }
    }

    public int Max() {
        int[] temp =new int[sizeY];
        for (int i = 0; i < sizeY; i++) {
            temp[i]=Arrays.stream(array[i]).max().getAsInt();
        }
        return Arrays.stream(temp).max().getAsInt();
    }
    public int Min() {
        int[] temp =new int[sizeY];
        for (int i = 0; i < sizeY; i++) {
            temp[i]=Arrays.stream(array[i]).min().getAsInt();
        }
        return Arrays.stream(temp).min().getAsInt();
    }
    public float Avg(int[] value) {
        int sum = 0;
        for (int n : value) {
            sum += n;
        }
        return (float) sum / value.length;
    }
    public float Avg(float[] value) {
        int sum = 0;
        for (float n : value) {
            sum += n;
        }
        return (float) sum / value.length;
    }
//    public  <T> T Avg(T[] value) {
//        var sum;
//        for (T n : value) {
//            sum += n;
//        }
//        return (T) sum / value.length;
//    }
    public float Avg2D() {
        float[] temp =new float[sizeY];
        for (int i = 0; i < sizeY; i++) {
            temp[i]=Avg(array[i]);
        }
        return Avg(temp);
    }
    public Matrix AddMatrix(Matrix matrix){
        if(sizeY== matrix.sizeY&&sizeX== matrix.sizeX){
            for (int i = 0; i < sizeY; i++) {
                for (int j = 0; j < sizeX; j++) {
                    array[i][j]+=matrix.array[i][j];
                }
            }
        }
        return this;
    }
    public Matrix SubtractedMatrix(Matrix matrix){
        if(sizeY== matrix.sizeY&&sizeX== matrix.sizeX){
            for (int i = 0; i < sizeY; i++) {
                for (int j = 0; j < sizeX; j++) {
                    array[i][j]-=matrix.array[i][j];
                }
            }
        }
        return this;
    }
    public Matrix MultiplydMatrix(Matrix matrix){
        int m = sizeY;
        int n = matrix.sizeX;
        int o = matrix.sizeY;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += array[i][k] * matrix.array[k][j];
                }
            }
        }
        this.array=res;
        return  this;
    }
}
