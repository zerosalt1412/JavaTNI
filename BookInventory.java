import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        for (int i = 0; i < books.length;i++){
            String title = JOptionPane.showInputDialog("Enter book title: " + (i+1));
            int totalBook = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number: " + (i+1)));
            books[i] = new Book(title,totalBook);

        }
        for (int i = 0;i < books.length;i++){
            System.out.println(books[i].getTitle() + " has " + books[i].getTotalBook()
                    + " book, can borrow " + books[i].getAvailableBook() + " books.");
        }


    }
}
