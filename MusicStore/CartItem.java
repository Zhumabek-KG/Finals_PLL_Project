public class CartItem {
    private Album album;
    private int quantity;

    public CartItem(Album album, int quantity) {
        this.album = album;
        this.quantity = quantity;
    }

    public Album getAlbum() {
        return album;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return album + " | Quantity: " + quantity;
    }
}
