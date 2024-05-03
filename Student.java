public class Student {
    private String studNo;
    private String lastName;
    private String firstName;
    private String title;

    public Student(String studNo, String lastName, String firstName, String title) {
        this.studNo = studNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public String getStudNo() {
        return studNo;
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