package exception;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] a = new int[10];
        int idx;
        Scanner in = new Scanner(System.in);
        idx = in.nextInt();
        try {
            a[idx] = 10;
            System.out.println("123");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
