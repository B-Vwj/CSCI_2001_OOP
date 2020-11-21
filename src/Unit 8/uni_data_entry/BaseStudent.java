public class BaseStudent {
    protected String firstName;
    protected String lastName;
    protected int studentId;

    public BaseStudent(String first, String last, int id) {
        this.firstName = first;
        this.lastName = last;
        this.studentId = id;
    }

    @Override
    public String toString() {
        return ("\nStudent: " + firstName + " " + lastName
                + "\nID: " + studentId + "\n");
    }
}