public class GradStudent extends BaseStudent {
    protected String advisorName;
    protected String researchArea;

    public GradStudent(String first, String last, int id, String advisor, String researchArea) {
        super(first, last, id);
        this.advisorName = advisor;
        this.researchArea = researchArea;
    }

    @Override
    public String toString() {
        return ("\n" + super.toString() + "Graduate Student Advisor Name: "
                + advisorName + "\nResearch Area: " + researchArea);
    }
}