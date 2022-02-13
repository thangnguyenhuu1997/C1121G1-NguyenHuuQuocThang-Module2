package case_study.readwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteReadFile {
    public static void writeFile(String path, List<String> stringList, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            for (String i: stringList) {
                bufferedWriter.write(stringList.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
