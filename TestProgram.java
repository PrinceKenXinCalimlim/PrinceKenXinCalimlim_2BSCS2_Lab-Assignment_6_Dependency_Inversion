public class TestProgram {
    public static void main(String[] args) {
        
            Student student1 = new Student("246", "Bateman", "Patrick", "American Psycho");
            Process process1 = new Process(student1, new BorrowBook(), null);
            process1.bookprocess();
    
            Student student2 = new Student("456", "Corleone", "Michael", "The Godfather");
            Process process2 = new Process(student2, new BorrowBook(), null);
            process2.bookprocess();
    
            Student student3 = new Student("236", "Dunne", "Amy", "The Civil War Diary");
            Process process3 = new Process(student3, null, new BorrowJournal());
            process3.journalprocess();
    
            Student student4 = new Student("556", "Thurman", "Uma", "The Journals of Sylvia Plath");
            Process process4 = new Process(student4, null, new BorrowJournal());
            process4.journalprocess();
        }
    }
