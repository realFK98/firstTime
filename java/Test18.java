
import java.util.Scanner;

public class Test18 { 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        while(true) //ทำหน้า login แบบ while(true)
        {

            String youPassword = scanner.nextLine();
            if(youPassword.equals(password))
            {
                System.out.println("ถูก");
                break;//จะเป็นการหยุด loop
            }
            else
            {
                System.out.println("ลองใหม่");
            }
        }

    }
}