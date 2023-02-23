package ThreadAndFile.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 implements Runnable {
    String path;
    String pathDirectory;
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a path: ");
        path = in.nextLine();
        pathDirectory= String.valueOf(Paths.get(path).getParent());
        Thread t1 = new Thread(() -> {
            int[] arr = IntStream.generate(() -> new Random().nextInt((50)) - 25).limit(50).toArray();
            writeFileToArray(arr, path);
        });
        Thread t2 = new Thread(() -> {
            int[] arr = readFileToArray();
            writeToArraySimple(arr, pathDirectory+"\\simple.txt");
        });

        Thread t3 = new Thread(() -> {
            int[] arr = readFileToArray();
            writeToArrayFactorial(arr, pathDirectory+"\\factorial.txt");
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();
    }

    private void writeFileToArray(int[] array, String path) {

        try (FileOutputStream fos = new FileOutputStream(path)) {
            byte[] buffer = Arrays.toString(array).getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println(Arrays.toString(array));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized int[] readFileToArray() {
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (Exception ex) {
        }
        String s = new String(bytes, StandardCharsets.UTF_8);
        s = s.substring(1, s.length() - 1);
        return Stream.of(s.split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    private boolean isSimple(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void writeToArraySimple(int[] array, String path) {
        var simple = Arrays.stream(array).filter(item -> isSimple(item)).toArray();
        writeFileToArray(simple, path);
    }
    private void writeToArrayFactorial(int[] array, String path) {
        var simple = Arrays.stream(array).filter(p->p>0).map(p->calculateFactorial(p)).filter(p->p>0).toArray();
        writeFileToArray(simple, path);
    }

    private int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
