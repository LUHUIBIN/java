package CDs;

public class Item {
    private String title;
    private int palyingTime;
    private boolean gotIt = false;
    private String comment;

    public Item(){

    }

    public Item(String title, int palyingTime,String comment) {
        super();
        this.title = title;
        this.palyingTime = palyingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.println(title);
    }
    public static void main(String[] args) {

    }

}

