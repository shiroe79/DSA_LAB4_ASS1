import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean exit = false;


        while (!exit){
            System.out.println("""             
                    Press:
                        1 - To add a task to your list.
                        2 - To mark your task as completed.
                        3 - To view the tasks your working on.
                        4 - To exit the program.
                    """);
            System.out.print("Choice = ");
            int choice;
            try {
                choice = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                break;
            }
            sc.nextLine();

            while (choice < 1 || choice > 4) {
                System.out.println("Please enter valid number.");
                System.out.println("""
                        Press:
                        1 - To add a task to your list.
                        2 - To mark your task as completed.
                        3 - To view the tasks your working on.
                        4 - To exit the program,
                        """);
                System.out.print("Choice = ");
                choice = sc.nextInt();
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Task's Title: ");
                    String title = sc.nextLine();
                    System.out.print("Task's description: ");
                    String description = sc.nextLine();

                    Task task = new Task(title, description);
                    toDoList.addToDo(task);
                }
                case 2 -> {
                    if (toDoList.isEmpty()) {
                        System.out.println("you have no ongoing tasks.");
                        break;
                    }
                    System.out.print("Enter title of the task completed: ");
                    String title = sc.nextLine();
                    toDoList.markToDoAsCompleted(title);
                }
                case 3 -> toDoList.viewToDoList();
                case 4 -> {
                    System.out.println("It was good serving you.");
                    exit = true;
                }
            }
        }
        sc.close();
    }
}