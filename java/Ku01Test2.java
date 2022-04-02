import java.util.ArrayList;
import java.util.Scanner;

public class Ku01Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i<people;i++)
        {
            x.add(i+1);
            list.add(sc.nextInt());
        }
        System.out.println(x);
        System.out.println(list);
        for(int i =0;i<people;i++)
        {
            int ans = 0;
            while(x.get(i)!=ans)
            {
                switch(x.get(i)){ //จะทำการหาเงื่อนไขที่ตรงถ้าไม่มี break 
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
        
        
    }
}
