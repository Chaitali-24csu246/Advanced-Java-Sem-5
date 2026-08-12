public class Admin extends Person {
    private String role;
    private String officeLocation;

    public Admin() {
        super("","","");
        role="";
        officeLocation="";
    }

    public Admin(String role, String officeLocation,String email,String phone,String name) {
        super(name,email,phone);
        this.role = role;
        this.officeLocation = officeLocation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Admin Dashboard:");
        System.out.println("Name: " + getName());
        System.out.println("Role: " + role);
        System.out.println("Office Location: " + officeLocation);   
    }
}
