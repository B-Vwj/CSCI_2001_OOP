import java.util.Scanner;
import java.util.ArrayList;

public class BaseStudentTest {

    public static void main(String args[]) {
        int choice;
        int student_id;
        int graduation_year;
        String student_first;
        String student_last;
        String undergrad_major;
        String student_advisor;
        String student_research_area;
        String thesis_title;

        ArrayList<BaseStudent> al = new ArrayList<BaseStudent>();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.print("Create a new student...\n");
            System.out.println("Enter either 1, 2, 3. or exit with -1");
            System.out.println("Undergraduate Student, Graduate Student, Doctoral Student respectively");
            choice = Integer.parseInt(s.nextLine());

            if (choice == -1) {
                break;
            } else if (choice == 1 || choice == 2 || choice == 3) {
                switch(choice) {
                    case 1:
                        System.out.println("What is the Student's first name?");
                        student_first = s.nextLine();
                        System.out.println("What is the Student's last name?");
                        student_last = s.nextLine();
                        System.out.println("What is the Student's id number?");
                        student_id = Integer.parseInt(s.nextLine());
                        System.out.println("What is the Student's intended major?");
                        undergrad_major = s.nextLine();
                        System.out.println("What is the Student's intended Graduation Year?");
                        graduation_year = Integer.parseInt(s.nextLine());

                        UndergradStudent ug = new UndergradStudent(student_first, student_last, student_id, undergrad_major, graduation_year);
                        al.add(ug);
                        break;
                    case 2:
                        System.out.println("What is the Student's first name?");
                        student_first = s.nextLine();
                        System.out.println("What is the Student's last name?");
                        student_last = s.nextLine();
                        System.out.println("What is the Student's id number?");
                        student_id = Integer.parseInt(s.nextLine());
                        System.out.println("What is the Student's Advisor's name?");
                        student_advisor = s.nextLine();
                        System.out.println("What is the Student's Research Area?");
                        student_research_area = s.nextLine();

                        GradStudent grad = new GradStudent(student_first, student_last, student_id, student_advisor, student_research_area);
                        al.add(grad);
                        break;
                    case 3:
                        System.out.println("What is the Student's first name?");
                        student_first = s.nextLine();
                        System.out.println("What is the Student's last name?");
                        student_last = s.nextLine();
                        System.out.println("What is the Student's id number?");
                        student_id = Integer.parseInt(s.nextLine());
                        System.out.println("What is the Student's Advisor's name?");
                        student_advisor = s.nextLine();
                        System.out.println("What is the Student's Research Area?");
                        student_research_area = s.nextLine();
                        System.out.println("What is the Doctoral Student's Thesis Title?");
                        thesis_title = s.nextLine();

                        DoctoralStudent ds = new DoctoralStudent(student_first, student_last, student_id, student_advisor, student_research_area, thesis_title);
                        al.add(ds);
                        break;
                }
            } else {
                System.out.println("Unknown input! Try again!");
            }
        }

        System.out.println();
        System.out.println(al);
        System.out.println();

    }

}