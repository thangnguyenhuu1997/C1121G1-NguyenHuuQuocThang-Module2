package ss16_io_text_file.bai_tap.CopyFile;
import java.io.*;

public class CopyFile {
    public static final String SOURCE_FILE = "E:\\Download\\Module2\\src\\ss16_io_text_file\\bai_tap\\CopyFile\\thang.csv";
    public static final String TARGET_FILE = "E:\\Download\\Module2\\src\\ss16_io_text_file\\bai_tap\\CopyFile\\ok.csv";
    public static String readFile(FileReader fileReader) {
        int i = 0;
        String result = "";

        try {
            while ((i = fileReader.read()) != -1) {
                System.out.println(i);
                result += (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public static void writeFile(FileWriter fileWriter, String result) {
        try {
            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        String result = "";
        File fileSource = new File(SOURCE_FILE);
        File fileTarget = new File(TARGET_FILE);
        try {
            FileReader fileReader = new FileReader(fileSource);
            FileWriter fileWriter = new FileWriter(fileTarget);
            result = readFile(fileReader);
            writeFile(fileWriter, result);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
