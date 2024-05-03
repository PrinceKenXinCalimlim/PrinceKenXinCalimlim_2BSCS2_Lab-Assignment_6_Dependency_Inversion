public class Book implements Library {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowed  book: " + title);
    }
}