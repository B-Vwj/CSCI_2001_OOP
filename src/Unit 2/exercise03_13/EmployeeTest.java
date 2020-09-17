public class EmployeeTest {

    public static void main (String[] args) {

//      Creating new employees of type Employee
        Employee e1 = new Employee("John", "Smith", 4000);
        Employee e2 = new Employee("Jane", "Doe", 5000);

//      Test Getters
        System.out.println("The first employee is: " + e1.getName() + " " + e1.getLastName() + " and their monthly salary is " + e1.getSalary() + " dollars");
        System.out.println("The second employee is: " + e2.getName() + " " + e2.getLastName() + " and their monthly salary is " + e2.getSalary() + " dollars");
        System.out.println("");

//      Giving Employees a 10% raise
//      Also testing Setters
        System.out.println("Giving both " + e1.getName() + " " + e1.getLastName() + " and " + e2.getName() + " " + e2.getLastName() + " a 10% raise!");
        e1.setSalary(e1.getSalary() * 1.10);
        e2.setSalary(e2.getSalary() * 1.10);

//      Results
        System.out.println("");
        System.out.println("The first employee is: " + e1.getName() + " " + e1.getLastName() + " and their monthly salary is " + e1.getSalary() + " dollars");
        System.out.println("The second employee is: " + e2.getName() + " " + e2.getLastName() + " and their monthly salary is " + e2.getSalary() + " dollars");

    }

}