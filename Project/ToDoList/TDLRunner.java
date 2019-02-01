import java.util.Scanner;
// @author Madhav Shekhar Sharma
// Date: 22/1/19
public class TDLRunner {
    public static void main(String[] args) {
        ToDoList tdl = new ToDoList(10);
        Scanner s = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println(tdl);
            System.out.println("(1) add an item\n(2) mark an item complete\n: ");
            choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
                System.out.println("Enter the name of the task: ");
                String newTask = s.nextLine();
                tdl.addTask(newTask);
            } else if (choice == 2) {
                System.out.println("Enter the task number: ");
                tdl.completeTask(s.nextInt());
            }
        } while (choice > 0 && choice < 3);

        System.out.println("Final list\n----------\n" + tdl);
    }
} 
