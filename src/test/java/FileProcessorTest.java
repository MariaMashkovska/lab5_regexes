import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProcessorTest {
    private static final String path = "D:\\folderFor5lab\\logo234";
    private static final Pattern pattern = Pattern.compile("^logo.*\\d.*$");

    @Test
    public void testRenamingFiles() {
        File file = new File(path);

        Matcher matcher = pattern.matcher(file.getName());
        String newName = null;
        if (matcher.matches()) {
            newName = file.getName()
                    .replaceAll("logo[3|6]", "LOGO_")
                    .toUpperCase();
            File newFile = new File(path + newName);
            file.renameTo(newFile);
        }

        String expectedString = "LOGO234";
        Assertions.assertEquals(expectedString, newName);
    }


}
