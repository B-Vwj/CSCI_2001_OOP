public class Employee {

    private String name;
    private String lastName;
    private double salary;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            System.out.println("Salary Value cannot be negative");
        }
    }

    public double getSalary() {
        return salary;
    }
}
