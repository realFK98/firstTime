import java.util.Scanner;

public class Test16 { 
    public static void main(String[] args){  
        String password = "1234";
        String input;
        do      //ตัว do while จะเรึ่มทำงานก่อนเช็ค //เหมาะกับทำหน้า login
        {       //ทุกตัวแปรมีขอบเขต ตัวที่อยู่ข้างใน{}จะหยิบออกมาข้างนอกไม่ได้
                //แต่ตัวที่อยู่ข้างนอdสามมารถนำมาใช้ข้างใน{}ได้
                //สามารถแก้ได้โดยการประกาศค่าข้องนอก{}เพิ่มมา เช่น String input;
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }
        while(!password.equals(input)); //การกรอกค่า ! จะทำให้เป็นนิเสธหรือตรงกันข้ามจะถือเป็นจริง เช่น คำสั้งนี้ตัวที่ไม่ใช่ค่าเดียวกัน ถือว่าเป็นจริง
        System.out.print("Hello World");

    }
}