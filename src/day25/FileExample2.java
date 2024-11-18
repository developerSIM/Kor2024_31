package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInput = new FileInputStream("./src/day25/test1.txt");
            byte[] bytes = new byte[10];
            fileInput.read( bytes );
            System.out.println( new String (bytes));

        }catch ( FileNotFoundException e) {


            e.printStackTrace();


        }catch ( IOException e ){
            e.printStackTrace();
        }
    }
}
