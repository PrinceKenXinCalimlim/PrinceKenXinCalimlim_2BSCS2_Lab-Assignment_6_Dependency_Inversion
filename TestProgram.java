public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("246", "Bateman", "Patrick", "American Psycho");
        Process process1 = new Process(student1, new BorrowBook());
        process1.processBook();
    
        Student student2 = new Student("456", "Corleone", "Michael", "The Godfather");
        Process process2 = new Process(student2, new BorrowBook());
        process2.processBook();
    
        Student student3 = new Student("236", "Dunne", "Amy", "The Civil War Diary");
        JournalProcess process3 = new JournalProcess(student3, new BorrowJournal());
        process3.processJournal();
    
        Student student4 = new Student("556", "Thurman", "Uma", "The Journals of Sylvia Plath");
        JournalProcess process4 = new JournalProcess(student4, new BorrowJournal());
        process4.processJournal();
    }
}
