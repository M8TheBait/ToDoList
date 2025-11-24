import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        TaskManager toDos = new TaskManager(scanner);
        int choice = 0;

        do{
            System.out.println("************************");
            System.out.println("Welcome to my To-Do List");
            System.out.println("************************");
            System.out.println("1. Add task");
            System.out.println("2. View Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> toDos.addTask();
                case 2 -> toDos.viewTask();
                case 3 -> toDos.removeTask();
                case 4 -> System.out.println("Closing program...");
                default -> System.out.println("Invalid choice! Enter between 1-4");
            }
        } while(choice != 4);

        scanner.close();
    }
}
