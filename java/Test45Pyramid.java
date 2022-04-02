import java.util.Scanner;

public class Test45Pyramid {
    public static void main(String[] args) {
        pyramid1();
    }
    public static void pyramid1(){
        int i,x,y,layer,all=0;
        Scanner sc = new Scanner(System.in);
        layer = sc.nextInt();
        for(i=1;i<=layer;i++)
        {
            for(x=i;x<layer;x++)//
               System.out.print(" ");//ถ้าไม่ใส่ {}  จะทำงานแค่คำสั่งถัดไปเท่านั้น
            for(y=1;y<i*2;y++){
                all++;
                System.out.print("*");
                }
                System.out.print("\n");//เว้นวรรค      
        }
        System.out.println("มี * ทั้งหมด "+all+" ตัว");
    }
  
}
