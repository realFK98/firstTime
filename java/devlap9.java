import java.util.ArrayList;
import java.util.Scanner;

public class devlap9 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0;i<x;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i = list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
       
    }
}
