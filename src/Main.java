import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Declare variables

        Scanner scanner = new Scanner (System.in);
        int choice = 0;

        // initialize list

        ArrayList<String> toDo = new ArrayList<>();

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
        } while(choice != 4);

        // Add components to list using user input
        // checkbox to list
        // complete list
    }
}
