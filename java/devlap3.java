import java.util.ArrayList;
import java.util.Collections;//เติม s
import java.util.Scanner;
//น้ำหนักปลา
public class devlap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList list = new ArrayList();
        int x=1;
        String celculater;
        while (x != 0) {
           String input = sc.nextLine();
           x = Integer.parseInt(input);
            if (x != 0)
                list.add(Integer.parseInt(input));
        }

        Collections.sort(list);
        celculater = sc.nextLine();
        if(celculater.equalsIgnoreCase("max")) //equalsIgnoreCase คือไม่สนตัวพิมใหญ่
        {
                for (int i = list.size() - 1; i >= 0; i--)
                    System.out.print(list.get(i) + " ");
        }
        else if(celculater.equalsIgnoreCase("min"))
        {
  
                for (int i = 0; i < list.size() - 1; i++)
                System.out.print(list.get(i) + " ");
        }

    }

}
