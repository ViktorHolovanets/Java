package ThreadAndFile.Task4;

import lombok.AllArgsConstructor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;
@AllArgsConstructor
public class Task4 implements Runnable {
    private String pathDirectory;
    private String pathFileResult;
    private String pathExceptWords;
    private String word;
    private ExecutorService executorService;

    @Override
    public void run() {
        try {
            searchWord(word, pathDirectory, executorService);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        new Thread(() -> {
            try {
                String content = Files.lines(Paths.get(pathFileResult)).reduce("", String::concat);
                try (Stream<String> lines = Files.lines(Paths.get(pathExceptWords))) {
                    lines.forEach(s -> content.replace(s, ""));
                } catch (IOException ex) {
                }
                FileWriter nFile = new FileWriter(pathFileResult);

                nFile.write(content);

                nFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public void searchWord(String word, String path, ExecutorService executors) throws IOException {
        File dir = new File(path);
        var list = dir.listFiles();
        if (countDirectory(list) == 0) {
            executorService.shutdown();
        }
        for (File item : list) {
            if (item.isDirectory()) {
                executorService.submit(new Thread(() -> {
                    try {
                        searchWord(path, item.getAbsolutePath(), executorService);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }));
            } else {
                appendResultSearch(item.getAbsolutePath(), word);
            }
        }
    }

    private long countDirectory(File[] files) {
        return Arrays.stream(files).filter(p -> p.isDirectory()).count();
    }

    public synchronized void appendResultSearch(String path, String word) throws IOException {
        String content = Files.lines(Paths.get(path)).reduce("", String::concat);
        if (content.indexOf(word) != -1) {
            File file = new File("E:\\result.txt");
            if (file.exists()) {
                file.createNewFile();
            }
            FileWriter fr = null;
            try {
                fr = new FileWriter(file, true);
                fr.write(content.toString());

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
