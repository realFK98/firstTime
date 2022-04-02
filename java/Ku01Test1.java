import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Github
public class Ku01Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        String[] input;
        input = sc.nextLine().split(" ");
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);
        z = Integer.parseInt(input[2]);
        
        int index = 0;
        Set<Integer> ans = new HashSet<Integer>();//ตอบ
        int i = 1;
        ans.add(1);
        while(index != z && index !=1 )
        {
            i=i+y;
            if(i>x)
            {
                i=i-x;
            }
            ans.add(i);
            index = i;
        }
        System.out.println(ans.size());
        


    }
    
}
