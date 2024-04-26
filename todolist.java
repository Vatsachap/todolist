import java.util.ArrayList;
import java.util.Scanner;


public class todolist {
    private static ArrayList<String> Tasks = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
    while (true) {
        
    
  System.out.println("Select an option");
  System.out.println("1. Add a task");
  System.out.println("2. view a task");
  System.out.println("3. mark a task as completed");
  System.out.println("4. Exit");
  System.out.println("Choose an option from 1-4");
  int Option = scan.nextInt(); 
  // bull
  scan.nextLine();
  switch (Option) {
    case 1:
        addtask();
        break;
        case 2:
        viewtask();
        break;
        case 3:
        Markascomplete();
        break;
        case 4:
        System.out.println("exiting...");
        System.exit(0);
        break;
  
    default:
    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        break;
  }
 } 

}
private static void addtask(){
System.out.println("Enter your task");
String task = scan.nextLine();
Tasks.add(task);
System.out.println("Task added successfully");
}
private static void viewtask(){
if (Tasks.isEmpty()) {
    System.out.println("No tasks Found add a task first to view.");
}else{
for(int i=0;i<Tasks.size();i++){
    System.out.println((i+1) + ":" + Tasks.get(i));
}
}
}
private static void Markascomplete(){
    viewtask();
    if (!Tasks.isEmpty()) {
        System.out.println("what task did You complete?"); 
        int choice = scan.nextInt();
        if (choice>=1 && choice<=Tasks.size()) {
            System.out.println("Task has been completed and removed");
        }else{
            System.out.println("invalid task selected");
        }
    }
//f
    

}


}
