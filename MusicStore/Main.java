import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicStore store = new MusicStore();

        // Add some sample albums to the store
        store.addAlbum(new Album("Thriller", "Michael Jackson", 14.99));
        store.addAlbum(new Album("Back in Black", "AC/DC", 12.99));
        store.addAlbum(new Album("The Dark Side of the Moon", "Pink Floyd", 16.99));

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Music Store!");
            System.out.println("1. View Albums");
            System.out.println("2. Add Album to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    store.viewAlbums();
                    break;
                case 2:
                    store.viewAlbums();
                    System.out.print("Enter the title of the album you want to add to the cart: ");
                    String title = scanner.nextLine();
                    boolean found = false;
                    for (Album album : store.albums) {
                        if (album.getTitle().equalsIgnoreCase(title)) {
                            store.addToCart(album);
                            System.out.println(album.getTitle() + " added to the cart.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Album not found!");
                    }
                    break;
                case 3:
                    store.viewCart();
                    break;
                case 4:
                    double total = store.checkout();
                    System.out.println("Total amount: $" + total);
                    store.cart.clear();
                    break;
                case 5:
                    System.out.println("Thank you for shopping at the Music Store!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }
}
