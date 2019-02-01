// Course.java Lecture 53  using diff methods 
//complimentary to Course-Test.java
public class Course
{

    private String name();

    public Course(){ //no parameter constructor
        name = " "; //empty string nothing in here no return type as constructors dont have them
    }
    public Course( String name ){ //constructor with a paramter but no return type
        this.name = name;           // Also, Overloading as same 2 methods have name but diff. params
    }
    public void setName( String name ) {             //mutator is being invoked (public setter method)
        this.name = name;
    }
    public String getName(){                    //accessor method getName
        return name;
    }
    public void printName() {
        System.out.println("Welcome to " + name );
    }
}

