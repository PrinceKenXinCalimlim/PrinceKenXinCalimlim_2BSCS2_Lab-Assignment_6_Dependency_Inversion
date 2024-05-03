public class Process {
    private Student student;
    private Book book;

    public Process(Student student, Book book) {
        this.student = student;
        this.book = book;
    }

    public void process() {
        book.borrow(student.getTitle());
    }
}