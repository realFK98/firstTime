import java.util.Scanner;

public class Test15 {
    public static void main(String[] args){ 
    //การใช้งาน switch
        Scanner scanner = new Scanner(System.in);  //วนลูป ประเภท while
        int i = scanner.nextInt();
        int a = 0;

        while(i<1000){  //ถ้าเป็นจริงจะวนไปเรื่อยๆจนกว่าจะเท็จ
            a= a + 1;
            System.out.println(a + " ครั้ง");
            i +=1;
        }
    }
}