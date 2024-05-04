public class JournalProcess {

    private Student student;
    private BorrowJournal journal;

    public JournalProcess(Student student, BorrowJournal journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}
