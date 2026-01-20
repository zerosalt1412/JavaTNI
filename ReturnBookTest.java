import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 5);
        while (true){
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to borrow/return books?",
                    "Borrow/Return Book",JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 to borrow book\n " +
                                "Press 2 to return book"
                ));
                if (menu == 1) {

                if (book.getAvailableBook() != 0) {
                    book.borrowBook();
                    System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No books available to borrow...",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                    continue;
                    }
                } else if (menu==2) {
                    if(book.getAvailableBook() != book.getTotalBook()){
                        book.returnBook();
                        System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.",
                                "Warning Message", JOptionPane.WARNING_MESSAGE);
                        continue;
                    }
                }


            }
            else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
        }
    }
}
