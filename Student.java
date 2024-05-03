public class Student {
    private String studentNo;
    private String lastName;
    private String firstName;
    private String title;

    public Student(String studentNo, String lastName, String firstName, String title) {
        this.studentNo = studentNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }
}