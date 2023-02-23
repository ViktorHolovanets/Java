package ThreadAndFile.Task1.models;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Task1 implements Runnable {
    int[] arr;
    @Override
    public void run() {

        Thread t1 = new Thread(() -> {
            arr=IntStream.generate(() -> new Random().nextInt((50)) - 25).limit(50).toArray();
        });
        Thread t2 = new Thread(() -> {
            System.out.println("SUM item of array "+ IntStream.of(arr).sum());
        });
        Thread t3 = new Thread(() -> {
            System.out.println("AVG of array "+ IntStream.of(arr).average());
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();
        System.out.println(Arrays.toString(arr));
        System.out.println("the end");

    }
}
