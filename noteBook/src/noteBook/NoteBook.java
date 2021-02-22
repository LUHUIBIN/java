package noteBook;


import java.util.ArrayList;
import java.util.HashSet;


class Value{
    private int i;
    public void set(int i){this.i = i;}
    public int get(){return i;}
    public String toString(){return ""+i;}

}

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<>();

    public void add(String s){
        notes.add(s);
    }
    public void add(String s, int location){
        notes.add(location,s);
    }
    public int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return notes.get(index);
    }
    public String removeNote(int index){
        return notes.remove(index);
    }
    public String[] list(){
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }
    public static void main(String[] args) {

        Value v = new Value();
        v.set(1);
        System.out.println(v);



        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third",0);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        nb.removeNote(0);
        String[] a = nb.list();
        for(String s:a){
            System.out.println(s);
        }

        System.out.println("------");
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");

        System.out.println(s);

    }
}
