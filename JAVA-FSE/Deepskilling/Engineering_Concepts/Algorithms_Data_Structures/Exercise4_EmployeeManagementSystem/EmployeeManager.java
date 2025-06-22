public class EmployeeManager {
    Employee[] employees;
    int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        } else {
            System.out.println("Cannot add more employees.");
        }
    }

    
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    
    public void displayAll() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

   
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
