public class EmployeeSystemTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Asha", "HR", 50000));
        manager.addEmployee(new Employee(102, "Ravi", "Developer", 65000));
        manager.addEmployee(new Employee(103, "Sneha", "Designer", 55000));

        System.out.println("All Employees:");
        manager.displayAll();

        System.out.println("\nSearching for Employee ID 102:");
        Employee found = manager.searchEmployee(102);
        if (found != null) {
            found.display();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee ID 101:");
        manager.deleteEmployee(101);

        System.out.println("\nEmployees after deletion:");
        manager.displayAll();
    }
}
