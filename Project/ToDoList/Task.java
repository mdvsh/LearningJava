//Example from edX Course

/** PurdueX: CS180.3x 
 * AP Computer Science A: Java Programming Classes and Objects  */

 public class Task{
     private String name;
     private Boolean isDone;

     public Task(String name){

     }

     public Boolean getStatus(){return isDone;}

     public String getName(){return name;}

     public void setStatus(){}

     public String toString() {
        return name + (isDone?" Completed":" Not Completed");
    }
 }