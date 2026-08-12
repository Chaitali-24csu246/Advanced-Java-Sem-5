public class Faculty extends Person implements Payable, Reportable {
    private String designation;
    private double salary;

   

    public Faculty(String name, String phone, String designation, double salary,String email) {
        super(name ,email,phone);
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String getReportDetails() {
        return "Faculty Report:\n" +
                "Name: " + getName() + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: " + salary;
    }

    @Override
    public void generateReport() {
        System.out.println("Faculty Report:");
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public void displayDashboard() {
        System.out.println("Faculty Dashboard:");
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
