import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class FileOperation {

    public static boolean createFile(String path, boolean rewrite) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            if (rewrite) {
                if (file.delete())
                    return file.createNewFile();
                else
                    return false;
            } else
                return false;
        } else
            return file.createNewFile();
    }

    public static boolean createDirectory(String path, boolean rewrite) {
        File file = new File(path);
        if (file.exists()) {
            if (rewrite) {
                boolean successful;
                for (File file1 : Objects.requireNonNull(file.listFiles())) {
                    if (!file1.delete())
                        return false;
                }
                return true;
            } else {
                return false;
            }
        } else {
            return file.mkdir();
        }
    }

    public static boolean deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile())
                return file.delete();
            else
                return false;
        } else
            return true;
    }

    public static boolean deleteDirectory(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file1 : Objects.requireNonNull(file.listFiles())) {
                    if (!file1.delete())
                        return false;
                }
                return file.delete();
            } else
                return false;
        } else
            return true;
    }

    public static void moveTo(String fromPath, String toPath, CopyOption... options) throws IOException {
        String path = toPath.replace(fromPath, "");
        createDirectory(path, false);
        try {
            Files.move(Paths.get(fromPath), Paths.get(toPath), options);
        } catch (FileAlreadyExistsException ignored) {
        }
    }

    public static void copyTo(String fromPath, String toPath, CopyOption... options) throws IOException {
        String path = toPath.replace(fromPath, "");
        createDirectory(path, false);
        try {
            Files.copy(Paths.get(fromPath), Paths.get(toPath), options);
        } catch (FileAlreadyExistsException ignored) {
        }
    }

    public static String[] readFile(String path) throws IOException {
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<String> lines = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            lines.add(line);
            line = reader.readLine();
        }
        return lines.toArray(new String[0]);
    }

    public static void writeTextInFile(String path, String text, boolean adding) throws IOException {
        File file = new File(path);
        if (adding) {
            String[] line = readFile(path);
            text = ArrayOperation.objectArrayToString(line) + text;
        }
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }
}