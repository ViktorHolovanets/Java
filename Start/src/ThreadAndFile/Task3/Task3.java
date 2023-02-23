package ThreadAndFile.Task3;

import java.io.File;
import java.nio.file.Files;

public class Task3 implements Runnable {
    String fromPath;
    String toPath;

    public Task3(String fromPath, String toPath) {
        this.fromPath = fromPath;
        this.toPath = toPath;
    }

    @Override
    public void run() {
        File fromDir = new File(fromPath);
        File toDir = new File(toPath);
        if (fromDir.isDirectory() && toDir.isDirectory())
            for (File item : fromDir.listFiles()) {
                if (item.isDirectory()) {
                    File dir = new File(toDir.getPath() + "/" + item.getName());
                    dir.mkdir();
                    new Thread(new Task3(item.getAbsolutePath(), dir.getAbsolutePath())).start();
                } else {
                    copyFile(item.getAbsolutePath(), toDir.getPath() + "/" + item.getName());
                }
            }
    }

    public void copyFile(String from, String to) {
        File origin = new File(from);
        File newF = new File(to);
        try {
            Files.copy(origin.toPath(), newF.toPath());
        } catch (Exception ex) {
        }
    }
}
