import java.util.*;
import java.lang.*;
public class Test44MultipleInput{
 public static void main(String[] args) { //รับค่าหลายตัวแบบบรรทัดเดียว
String[] input;
int[] a = new int[10]; //ใส่ , ได้ในการประกาศตัวแปร
Scanner sc = new Scanner(System.in);
input = sc.nextLine().split(" ");
a[0] = Integer.parseInt(input[0]);//แปลง string เป็น int
a[1] = Integer.parseInt(input[1]);
int d=10,j=10,k = 10;//ใส่ได้หลายอัน
System.out.println(a[0]);
System.out.println(a[1]);

 }
}
