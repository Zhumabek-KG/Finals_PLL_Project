public class Album {
    private String title;
    private String artist;
    private double price;

    public Album(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Album [Title=" + title + ", Artist=" + artist + ", Price=$" + price + "]";
    }
}
