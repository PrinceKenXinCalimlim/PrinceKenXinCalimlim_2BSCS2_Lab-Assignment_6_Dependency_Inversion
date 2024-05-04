public class Process {
    private Student student;
    private BorrowBook book;
    private BorrowJournal journal;

    public Process(Student student, BorrowBook borrowBook,BorrowJournal borrowJournal) {
        this.student = student;
        this.book = borrowBook;
        this.journal = borrowJournal;
    }

    public void bookprocess() {
        book.borrow(student.getTitle());
    }
    public void journalprocess(){
    journal.borrow(student.getTitle());
}
}
