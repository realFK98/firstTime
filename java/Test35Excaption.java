import java.util.Scanner;

public class Test35Excaption{
  public static void main(String[] args) {
    try{//คือคำสั่งลองโคดนี้หากเกิด Error ขึ้นโปรแกรมจะไม่ปิดตัวลง
    Scanner sc = new Scanner(System.in);
    int INT = sc.nextInt();
    }
    catch(Exception e)//เมื่อ error จะสั่งทำงานอันนี้แทน
    {
      System.out.println("ตัวเลขเว้ย");
    }
  }
}