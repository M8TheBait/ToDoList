import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Declare variables

        Scanner scanner = new Scanner (System.in);
        int choice = 0;
        String task;
        int remove = 0;

        // initialize list

        ArrayList<String> toDos = new ArrayList<>();

        // Present options through a do-while loop

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
                case 1 -> {
                    System.out.println("Write the task you would like to add below: ");
                    task = scanner.nextLine();
                    toDos.add(task);
                    System.out.println("task added");
                }
                case 2 -> {
                    if(toDos.isEmpty()){
                        System.out.println("The list is empty");
                    }
                    else{
                        for(int i = 0; i < toDos.size(); i++){
                            System.out.println((i+1) + ". " + toDos.get(i));
                        }
                    }
                }
                case 3 -> {
                    if(toDos.isEmpty()){
                        System.out.println("The list is empty");
                    }
                    else {
                        System.out.println("Enter the task number you want to remove: ");
                        for(int i = 0; i < toDos.size(); i++){
                            System.out.println((i+1) + ". " + toDos.get(i));
                        }
                        remove = scanner.nextInt();
                        scanner.nextLine();
                        if(remove > 0 && remove <= toDos.size()){
                            toDos.remove(remove - 1);
                            System.out.println("Task removed.");
                        }
                        else{
                            System.out.println("Invalid Task number");
                        }
                    }
                }
                case 4 -> System.out.println("Closing program...");
                default -> System.out.println("Invalid choice! Enter between 1-4");
            }
        } while(choice != 4);

        scanner.close();
    }
}
