import java.util.Scanner;
//เกรดเฉลี่ยมันเป็นเพียงแค่ตัวเลข
public class devlap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=90)
            System.out.println("A");
        else if(x>=85)
            System.out.println("B+");
        else if(x>=80)
            System.out.println("B");
        else if(x>=75)
            System.out.println("C+");
        else if(x>=70)
            System.out.println("C");
        else if(x>=65)
            System.out.println("D+");
        else if(x>=60)
            System.out.println("D");
        else if(x<60)
            System.out.println("F");
    }

}
