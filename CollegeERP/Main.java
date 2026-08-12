public class Main {
    public static void main(String[] args) {
        // 1. Create objects
        Student student1 = new Student("A", "b","v", "a@gmail", 7.6);

        Faculty faculty1 = new Faculty("Dr b", "54e65", "teacher", 12,"vcgf@gmail");
        
        Admin admin1 = new Admin("Michael Davis", "A001", "Admissions", "Manager","");
        
        // 2. Store them in Person[]
        Person[] persons = {student1, faculty1, admin1};//method overloading
        
        // 3. Invoke displayDashboard() to demonstrate runtime polymorphism
        System.out.println("=== College ERP Dashboard ===\n");
        for (Person person : persons) {
            person.displayDashboard();
            System.out.println();
        }
        
        // 4. Invoke interface methods where applicable
        System.out.println("=== Interface Methods ===\n");
        
        //  implements Payable
        faculty1.getPaymentAmount();
        
        // Faculty implements Reportable
        faculty1.generateReport();
        
    }
}
