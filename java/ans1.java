
//input
//1.จำนวน input 2.ค่าที่ใส่ตาม จำนวน input
//output
//ออกมาเป็นจำนวนครั้งที่สลับ
//สิ่งที่ต้องทำ
//ใส่ค่าลงไปโดยถ้าเป็นจำนวนคู่อยู่แล้วก็ให้ตอบ 0 แต่ถ้าไม่ใช้ก็ไห้ทำการสลับตามจำนวน l+1 ไปเรื่อยๆจนกว่าจะเป็นจำนวนคู่ โดยไล่จากขวาไปซ้ายเช่น  
//input :
//837
//celculater :
// ครั้งที่ 1  l = 1 ให้สลับแค่ตัวหน้า2ตัวแลกคือ 83 เป็น 387  //ยังไม่เป็นจำนวนคู่
// ครั้งที่ 2  l = 2 ให้สลับแค่ตัวหน้า3ตัวแลกคือ 837 เป็น 738 //เป็นจำนวนคู่
// output :
// 2

import java.util.Scanner;

public class ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//ใส่จำนวนนำเข้า
        int[] index = new int[n];

        for (int i = 0; i < n; i++)//ใส่ข้อมูล
            index[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {//ประมวลผล
            String celculater = Integer.toString(index[i]);//ค่าที่รับไปคำนวณ
            int ansInt, t = 0;//จำนวนครั้ง
            System.out.println("Output :");//ทำให้จำนวนสลับกันให้เป็นเลขจำนวนคู่
            if (index[i] % 2 == 0) { //ถ้าลงตัวอยู่แล้วตอบเลย
                System.out.println("Ans "+index[i]);
                System.out.println("Ans Time : "+0);
                
                
            } 
            else if(celculater.length()==1){//ถ้าเป็นเลขหลักเดียวตำนวนคี่จึงสลับไม่ได้ตอบ -1
                System.out.println(-1);
            }
            else //นำมาสลับกันดูเพื่อหาจำนวนครั้ง ----v----
            {
                int iii = 2; //ตัดแบ่งครึ่ง
                ansInt = 1;//กำหนดค่าเพื่อให้หารไม่ลงตัวยังติดอยู่ while loop
                while (ansInt % 2 != 0 )
                {
                
                String ans = "";
                String celculater1 = celculater,celculater2=""; //

                if(iii<celculater.length()) //แบ่งครืึ่ง
                {
                celculater1 = celculater.substring(0, iii);// 0<iii  ครึ่งซ้าย
                celculater2 = celculater.substring(iii,celculater.length()); //ครึ่งขวา
                }
                else if(iii==celculater.length())
                {
                    celculater1 = celculater.substring(0, iii);
                }
                else if(iii>celculater.length())//ถ้าไประมวลหมดแล้วยังไม่ตรง ออก loop นี้ แล้วใส่ -1
                {
                    System.out.println("Ans Time : "+-1);
                    break;
                }

                    for (int ii = (celculater1.length()-1); ii >= 0; ii--) //กลับหน้าหลังแค่ ครึ่งซ้าย
                    {
                        ans += celculater1.charAt(ii);//ไล่ใส่ทีละตัว
                    }
                    t++;//จบแต่ละรอบ +time
                    ans =ans+celculater2;//เอามาต่อกับครึ่งขวา
                    ansInt = Integer.parseInt(ans);
                    System.out.println("Test : " +ans+" Time : "+t );//แสดงค่าที่คำนวณแต่ละรอบ
                    iii++;
                }
                    System.out.println("Ans : "+ansInt);//แสดงค่าสุดท้าย
                    System.out.println("Ans Time : "+t);//แสดงค่า time ทั้งหมดที่ใช้
                 
                    

            }

        }
    }
}
