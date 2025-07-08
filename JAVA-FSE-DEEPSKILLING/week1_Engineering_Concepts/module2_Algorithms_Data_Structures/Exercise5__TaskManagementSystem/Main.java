public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Create UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Completed"));

        System.out.println("All Tasks:");
        manager.showAllTasks();

        System.out.println("\nSearch Task with ID 2:");
        Task found = manager.findTask(2);
        System.out.println(found != null ? found : "Task Not Found");

        System.out.println("\nDelete Task with ID 1:");
        boolean deleted = manager.removeTask(1);
        System.out.println(deleted ? "Deleted Successfully" : "Task Not Found");

        System.out.println("\nUpdated Task List:");
        manager.showAllTasks();
    }
}
