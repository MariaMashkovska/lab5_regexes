import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab5.FileProcessor;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileProcessorTest {

    @Test
    public void testIfEmpty() {

            String folderPath = "D:\\folderFor5lab2\\";
            File folder = new File(folderPath);

            File[] files = folder.listFiles();
            assertEquals(0, files.length);

    }

    @Test
    public void testRenamingFiles() {

            final String path = "D:\\folderFor5lab\\";

            File file1 = new File(path, "logo3.jpg");
            File file2 = new File(path, "logo6.png");
            File file3 = new File(path, "logo.gif");

            FileProcessor renamer = new FileProcessor();

            renamer.renamingFiles(path);

            File newFile1 = new File(path, "LOGO3.jpg");
            File newFile2 = new File(path, "LOGO6.png");
            File newFile3 = new File(path, "logo.gif");

            assertEquals(newFile1, file1);
            assertEquals(newFile2, file2);
            assertEquals(newFile3, file3);

        }
    }
