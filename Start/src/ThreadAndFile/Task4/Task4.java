package ThreadAndFile.Task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task4 implements Runnable {
    String path;
    private ExecutorService executorService;
//    public Task4(String path) {
//        this.path = path;
//        executorService= Executors.newCachedThreadPool();
//    }
public Task4() {
        executorService= Executors.newCachedThreadPool();
    }
    @Override
    public void run() {
        try {
            searchWord("Potter","C:\\A");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        System.out.println("End");
//        new Thread(()-> {
//            try {
//                searchWord("", path);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }).start();
//        executorService.shutdown();
//        new Thread(()-> {
//            try {
//                searchWord("", path);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }).start();

    }

    public void searchWord(String word, String path) throws IOException {
        File dir = new File(path);
        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                executorService.submit(new Thread(() -> {
                    try {
                        searchWord(path, item.getAbsolutePath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }));
            } else {
                appendResultSearch(item.getAbsolutePath(), word);
            }
        }
    }
    public synchronized void appendResultSearch(String path, String word) throws IOException {
        String content = Files.lines(Paths.get(path)).reduce("", String::concat);
        if (content.indexOf(word)!=-1) {
            File file = new File("E:\\result.txt");
            if(file.exists()){
                file.createNewFile();
            }
            FileWriter fr = null;
            try {
                fr = new FileWriter(file,true);
                fr.write(content.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
