import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class devlap7 {//v2 ก็แค่เรียงลำดับ
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     ArrayList list = new ArrayList();
     for(int i=0;i<x;i++)
     {
        list.add(sc.nextInt());
     }
     Collections.sort(list);
     for(int i = list.size()-1;i>=0;i--)
     System.out.println(list.get(i));
    }
}
    
