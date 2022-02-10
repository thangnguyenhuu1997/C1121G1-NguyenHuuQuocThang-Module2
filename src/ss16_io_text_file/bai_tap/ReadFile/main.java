package ss16_io_text_file.bai_tap.ReadFile;

import ss16_io_text_file.bai_tap.ReadFile.model.QuocGia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<QuocGia>list=new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("E:\\Download\\Module2\\src\\ss16_io_text_file\\bai_tap\\ReadFile\\file.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] array = line.split(",");
                    QuocGia quocGia = new QuocGia(Integer.parseInt(array[0]), array[1], array[2]);
                    list.add(quocGia);
                }
                bufferedReader.close();
                for (QuocGia quocGia: list) {
                    System.out.println(quocGia);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    }