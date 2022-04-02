import java.util.Scanner;

public class caseTest13 {
    public static void main(String[] args){ 
    //การใช้งาน switch
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch(userInput){ //จะทำการหาเงื่อนไขที่ตรงถ้าไม่มี break 
            case 1 :           //จะทำให้คำสั่งที่อยู่หลังเงื่อนไขที่ตรงทำงานไปด้วย
            System.out.println("Hello");
            break; // break คือหยุดการทำงานของ code ในนี้
            case 2 :
            System.out.println("Hell");
            break;
            default : //กรณีที่ไม่มีคำตอบในตัวเลือก
            System.out.println("--");
        }
    }
}