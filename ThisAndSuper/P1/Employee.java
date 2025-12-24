package ThisAndSuper.P1;

public class Employee extends Company {

    int empId;
    String empName;

    Employee(String companyName, int empId, String empName) {
        super(companyName);        
        this.empId = empId;        
        this.empName = empName;    
    }

    void showDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("TCS", 101, "Bhavik");
        e1.showDetails();
    }
}