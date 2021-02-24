package hello;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        System.out.println("hello");
        byte[] buf = new byte[10];
        for (int i = 0; i <buf.length ; i++) {
            buf[i] = (byte) i;
        }
        try {
            FileOutputStream out = new FileOutputStream("a.dat");
            try {
                out.write(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
