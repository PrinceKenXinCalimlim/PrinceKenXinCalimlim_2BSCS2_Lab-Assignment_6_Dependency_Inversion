public class Process {
    private Student student;
    private BorrowBook book;

    public Process(Student student, BorrowBook book) {
        this.student = student;
        this.book = book;
    }

    public void process() {
        book.borrow(student.getTitle());
    }
}