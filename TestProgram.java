public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("246", "Bateman", "Patrick", "American Pyscho");
        Process process1 = new Process(student1, new Book());
        process1.process();

        Student student2 = new Student("456", "Corleone", "Michael", "The GodFather");
        Process process2 = new Process(student2, new Book());
        process2.process();
    }
}