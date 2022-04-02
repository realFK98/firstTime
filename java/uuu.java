import java.util.ArrayList;
import java.util.Collection;
 
public class uuu {
 
  public static void main(String[] args) {
   
    ArrayList list = new ArrayList();
   
    list.add("1");
    list.add("3");
    list.add("5");
    list.add("2");
    list.add("4");
 

    Collections.sort(list);
   
    System.out.println("ArrayList elements after sorting in ascending order : ");
    for(int i=0; i<list.size(); i++)
      System.out.println(list.get(i));
 
  }
}
 
/*
Output would be
ArrayList elements after sorting in ascending order :
1
2
3
4
5
*/