import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class devlap5 {
    //ไม่ใช่แค่หนึ่ง แต่ถึงสาม
    public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<3; i++ )
        {
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.print(Collections.max(list));
    }
}
