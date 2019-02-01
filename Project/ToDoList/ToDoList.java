/** PurdueX: CS180.3x 
 * AP Computer Science A: Java Programming Classes and Objects  */

 public class ToDoList{
     private Task[]  myTasks;

     public ToDoList(int size){
        myTasks = new Task[size];
     }

     public Boolean addTask(String name){
            int t = 0;
            while (t < myTasks.length){
                if (myTasks[t] == null){
                    myTasks[t] = new Task(name);
                    return true;
                }
                t++;
            }
            return false;
     }

     public Boolean completeTask(int num){
        if (num <= 0 || num > myTasks.length)
        return false;
        myTasks[num - 1].setStatus();
        return true;
     }

     public String toString(){
            String out = "My To-do list: \n";
            out += "------------------------------\n";
            int n = 1;
            for (Task t : myTasks){
                out += (n + ": " + t + "\n");
                n++;
            }
            return out;
     }
 }