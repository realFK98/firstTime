import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){ 
             // IF เงื่อนไข
             //จะทำงานเมื่อเป็นจริง
     System.out.println("นายกเราฉลาดใหม (1=ไช่/2=ไม่)"); 
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int X = 2;
             if(M==X){ 
            System.out.println("โครตฉลาด");  
    }
    else
    {
        System.out.println("ไปคิดมาใหม่นะเด็กน้อย");
     }   
    
    }
}