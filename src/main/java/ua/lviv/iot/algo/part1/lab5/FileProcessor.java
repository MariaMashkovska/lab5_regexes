package ua.lviv.iot.algo.part1.lab5;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProcessor {
    private static final String path = "D:\\folderFor5lab\\";
    private static final Pattern pattern = Pattern.compile("^logo.*\\d.*$");

    public void renamingFiles(){
    File folder = new File(path);
    File[] files = folder.listFiles();

        for (File file : files) {
        Matcher matcher = pattern.matcher(file.getName());
        if (matcher.matches()) {
            String newName = file.getName()
                    .replaceAll("logo[3|6]", "LOGO_")
                    .toUpperCase();
            File newFile = new File(path + newName);
            file.renameTo(newFile);
        }
    }
    }
}

