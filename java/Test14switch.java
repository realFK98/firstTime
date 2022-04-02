import java.util.Scanner;

public class Test14switch {
    public static void main(String[] args){ 
    //การใช้งาน switch
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch(userInput){ //จะทำการหาเงื่อนไขที่ตรงถ้าไม่มี break 
            case "max" :           //จะทำให้คำสั่งที่อยู่หลังเงื่อนไขที่ตรงทำงานไปด้วย
            System.out.println("Hello");
            break; // break คือหยุดการทำงานของ code ในนี้
            case "555" :
            System.out.println("Hell");
            break;
            default : //กรณีที่ไม่มีคำตอบในตัวเลือก
            System.out.println("--");
        }
    }
}