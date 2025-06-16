public class Main {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Karthik", "S101", "A+");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student data
        controller.setStudentName("Narmadha");
        controller.setStudentGrade("A");

        // Display updated details
        controller.updateView();
    }
}
