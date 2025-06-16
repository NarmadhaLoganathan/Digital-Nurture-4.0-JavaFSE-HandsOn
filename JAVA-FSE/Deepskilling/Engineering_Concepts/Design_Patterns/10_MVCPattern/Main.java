public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Karthik", "S101", "A+");
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();

       
        controller.setStudentName("Narmadha");
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
