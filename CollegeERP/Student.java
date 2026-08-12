public class Student extends Person {
    private String rollNo;
    private double cgpa;

    public Student(String name, String email, String phone,
                   String rollNo, double cgpa) {
        super(name, email, phone);
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void payFees() {
        System.out.println("Paying fees for student " + rollNo);
    }

    public void generateReport() {
        System.out.println("Report for student " + rollNo + ": CGPA = " + cgpa);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Dashboard - Roll No: " + rollNo + ", CGPA: " + cgpa);
    }
}