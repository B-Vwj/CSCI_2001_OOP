public class UndergradStudent extends BaseStudent {
    private String major;
    private int projectedGradYear;

    public UndergradStudent(String first, String last, int id, String major, int year) {
        super(first, last, id);
        this.major = major;
        this.projectedGradYear = year;
    }

    @Override
    public String toString() {
        return ("\n" + super.toString() + "Undergraduate Student Major: "
                + major + "\nExpected Graduation Year: " + projectedGradYear);
    }
}