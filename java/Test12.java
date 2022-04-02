import java.util.Scanner;

public class Test12 {
    public static void main(String[] args){ 
        System.out.println("นายกเราฉลาดใหม (yes/no)"); 
        Scanner scaner = new Scanner(System.in);
        String Answar = scaner.nextLine();
       
        if(Answar.equals("no")){
            System.out.println("คุณโครตฉลาดบอกอีกทีซิ");
            String Answar2 = scaner.nextLine();
            if(Answar2.equals("no")){  //ถ้าจำเป็นต้องพิมค่า String ให้เหมือนกันต้องใช้คำสั่ง equals เท่านั้น!!
                System.out.println("คุณตาสว่างแล้ว"); //แต่ถ้า equals ภาษาไทยระบบจะตรวจไม่ได้
            } 
            else if(Answar2.equals("yes"))//if สามารถซ้อนกันได้
            {
                System.out.println("โธ่ไรวะ");
            }
        }
        else if(Answar.equals("yes")){
            System.out.println("ไปเรียนมาเยอะๆนะ");
        }
        else
        {
            System.out.println("ห่ะ");
        }
    }
}