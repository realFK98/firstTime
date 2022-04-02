import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){ 
             // แปลงเงินคอลลาร์เป็นบาท
             System.out.println("แปลงสกุลบาทเป็นดอลลาร์");
             System.out.println("กรุณาใส่จะนวนเงิน");
             Scanner dollramoney = new Scanner(System.in);
             double th = dollramoney.nextDouble();
             System.out.println(th+" ดอลลาร์เท่ากับ");
             System.out.println(th*32+" บาท");
    }
    
}
