package hello;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        byte[] buffer = new byte[1024];
        try {
            int len = System.in.read(buffer);
            String s = new String(buffer,0,len);
            System.out.println("read"+len+"bytes");
            System.out.println(s);
            System.out.println("s length is "+ s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
