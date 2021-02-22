package CDs;

public class DVD extends Item{
    private String director;

    public DVD(String title, String director, int palyingTime, String comment) {
//        this.title = title;
        super(title,palyingTime,comment);
        this.director = director;
//        this.palyingTime = palyingTime;
//        this.comment = comment;
    }

    public static void main(String[] args) {
        DVD dvd = new DVD("a","b",60,"000");
        dvd.print();
    }

    public void print() {
        System.out.println("DVD ");
        super.print();
        System.out.println(director);
    }
}
