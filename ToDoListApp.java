import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    // List to hold tasks
    private static ArrayList<String> tasks = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    tasks.add(task); // add task to the list
                    break;
                case 2:
                    System.out.println("Your Tasks:");
                    for (String t : tasks) {
                        System.out.println("- " + t);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();  // Properly close the scanner before exiting
                    return; // exit the program
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
