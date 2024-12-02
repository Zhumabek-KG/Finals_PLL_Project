// MusicStore.java
import java.util.ArrayList;
import java.util.List;

public class MusicStore {
    public List<Album> albums;
    public List<CartItem> cart;

    public MusicStore() {
        albums = new ArrayList<>();
        cart = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void viewAlbums() {
        if (albums.isEmpty()) {
            System.out.println("No albums available in the store.");
        } else {
            for (Album album : albums) {
                System.out.println(album);
            }
        }
    }

    public void addToCart(Album album) {
        boolean albumExists = false;
        for (CartItem item : cart) {
            if (item.getAlbum().equals(album)) {
                item.increaseQuantity();
                albumExists = true;
                break;
            }
        }
        if (!albumExists) {
            cart.add(new CartItem(album, 1));
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cart) {
                System.out.println(item);
            }
        }
    }

    public double checkout() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getAlbum().getPrice() * item.getQuantity();
        }
        return total;
    }

    // Getter method for the albums list
    public List<Album> getAlbums() {
        return albums;
    }
}
