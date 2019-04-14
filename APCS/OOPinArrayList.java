/** OOP Design in ArrayList
 * Take a ArrayList, and removes the specified string from the list.
 * Has TBBT reference...
 */
import java.util.*;  // import all classes in this package.
public class OOPinArrayList
{
   private List<String> nameList;

   public OOPinArrayList(List<String> theNames)
   {
       nameList = theNames;
   }

   public boolean removeName(String name)
   {
       boolean found = false;
       int index = 0;
       while (index < nameList.size())
       {
           if (name.equals(nameList.get(index)))
           {
               nameList.remove(index);
               found = true;
           }
           else index++;
       }
       return found;
    }

    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();
        myList.add("Penny");
        myList.add("Amy");
        myList.add("Raj");
        myList.add("Sheldon");
        myList.add("Leonard");
        OOPinArrayList listWorker = new OOPinArrayList(myList);
        System.out.println(listWorker.nameList);
        listWorker.removeName("Amy");
        System.out.println(listWorker.nameList);
    }
}
