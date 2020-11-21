public class DoctoralStudent extends GradStudent {
    private String thesisTitle;

    public DoctoralStudent(String first,
                           String last,
                           int id,
                           String advisor,
                           String researchArea,
                           String title) {
        super(first, last, id, advisor, researchArea);
        this.thesisTitle = title;
    }

    @Override
    public String toString() {
        return ("\n" + super.toString() + "\nThesis Title: " + thesisTitle);
    }
}