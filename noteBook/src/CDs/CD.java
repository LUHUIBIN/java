package CDs;

import java.util.Objects;

public class CD extends Item{
    private String artist;
    private int numofTracks;


    public CD(String title, String artist, int numofTracks, int palyingTime, String comment) {
//        this.title = title;
        super(title,palyingTime,comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
//        this.palyingTime = palyingTime;
//        this.comment = comment;
    }

    public static void main(String[] args) {
        CD cd = new CD("a","b",2,2,"a");
        cd.print();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return numofTracks == cd.numofTracks &&
                Objects.equals(artist, cd.artist);
    }

    @Override
    public int hashCode() {

        return Objects.hash(artist, numofTracks);
    }

    //    public void print() {
//        System.out.println("CD "+title+":"+artist);
//    }
}
