
import java.util.Scanner;

import javax.print.event.PrintEvent;



public class Test19 { 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        String user = "admin";
        String password = "1234";
        {
            String inputuser = scanner.nextLine();
            String inputpassword = scanner.nextLine();
            if(user.equals(inputuser) && password.equals(inputpassword)) //login แบบใช้&&
            {
                System.out.println("555");
            }
           
        }

    }
}