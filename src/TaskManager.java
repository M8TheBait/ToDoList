import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    String task;
    int removeTask;
    private ArrayList<String> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public TaskManager(Scanner scanner){
        this.scanner = scanner;
    }

    public void addTask(){
        System.out.println("Write the task you would like to add below: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("task added");
    }

    public void viewTask(){
        if(tasks.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    public void removeTask(){
        if(tasks.isEmpty()){
            System.out.println("The list is empty");
        }
        else {
            System.out.println("Enter the task number you want to remove: ");
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + ". " + tasks.get(i));
            }
            removeTask = scanner.nextInt();
            scanner.nextLine();
            if(removeTask > 0 && removeTask <= tasks.size()){
                tasks.remove(removeTask - 1);
                System.out.println("Task removed.");
            }
            else{
                System.out.println("Invalid Task number");
            }
        }
    }
}
