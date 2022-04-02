import java.util.ArrayList;
import java.util.Scanner;

public class Testreal {
    
    public static void main(String[] args) {
        add();
        
    }

    private static void add()
    {
    boolean again = false;
     int ans = 0;
     ArrayList<Integer> work = new ArrayList<Integer>(); 
     ArrayList<Integer> less18 = new ArrayList<Integer>();
     ArrayList<Integer> more18 = new ArrayList<Integer>();
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int t =0;
     while( t < x)
     {
        
        work.add(sc.nextInt());
        t+=1;
     }
     for(int i = 0;i>x;i++)
     {
         if(work.get(i)<=18)
         {
             less18.add(work.get(i));
         }
         else
         {
             more18.add(work.get(i));
         }
     }
     for(int i = 0;i>less18.size();i++)
     {
        int ansmini = 0;//
        ansmini +=less18.get(i);
        if(ansmini+less18.get(i+1)==18)
        {

        }

     }

    }
    
}
