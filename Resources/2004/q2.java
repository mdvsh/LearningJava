public abstract class Pet{

  public String speak(){
	  return "blah";
  }
}

public class Cat extends Pet
{
  public Cat(String name)
  {
    super(name); 
  }

  public String speak()
  {
    return "meow";
  }
}




public class LoudDog extends Dog 
{
  public LoudDog(String name)
  {
    super(name);
  }

  public String speak()
  {
    String s = super.speak(); 
    return s + s; 
  }
}



  public void allSpeak()
  {
    for (int i = 0; i < petList.size(); i++)
    {
      Pet pet = petList.get(i); 
      System.out.println(pet.getName() + " " + pet.speak());
    }
  }
