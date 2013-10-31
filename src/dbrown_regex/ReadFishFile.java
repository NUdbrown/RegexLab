package dbrown_regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFishFile {
	private String fileName;

    public ReadFishFile(final String fileName) {
        this.fileName = fileName;
    }

    public String getFileText() throws FileNotFoundException {
        if (fileName != null) {
            Scanner read = new Scanner(new File(fileName));
            read.useDelimiter("$"); 
            String text = read.next();
            read.close();

            return text;
        } else
            throw new IllegalAccessError("filename == null");
    }

}
