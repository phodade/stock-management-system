package tightly_encapsulated_example;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee("Collin", 22, 98675, "SQL Trainer");
        Employee e2 = new Employee("Rohit", 23, 98675, "WebTech Trainer");

        displayDetails(e1);
        displayDetails(e2);

        // Update details
        e1.setName("Collin Anthon Goves");
        e1.setDesignation("Selenium and Automation Trainer");

       e2.salary(87000);
        e2.setName("Rohit Bagadi Lifts");

        // Display updated details
        displayDetails(e1);
        displayDetails(e2);
    }

    public static void displayDetails(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Emp ID: " + e.geEmpid());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Designation: " + e.getDesignation());
        e.working();
        System.out.println("===================================");
    }
}
