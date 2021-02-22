package coins;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinanmes = new HashMap<Integer,String>();

    public Coin(){
        coinanmes.put(1,"penny");
        coinanmes.put(10,"dime");
        coinanmes.put(25,"quarter");
        coinanmes.put(50,"half-dolar");
        coinanmes.put(50,"五毛");
        for (Integer k : coinanmes.keySet()){
            String s = coinanmes.get(k);
            System.out.println(s);
        }

    }

    public String getName(int amount){
        if (coinanmes.containsKey(amount))
            return coinanmes.get(amount);
        else
            return "NOT FOUND";
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int amount =  in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
    }
}
