import java.util.Scanner;
//เด็กหญิงสมจริง กับ พีระมิดคู่ใจ
public class devlap2 {
    public static void main(String[] args) {
        int i, x, y, layer = 5;
        for (i = 1; i <= layer; i++) {
            for (x = i; x < layer; x++)//
                System.out.print(" ");// ถ้าไม่ใส่ {} จะทำงานแค่คำสั่งถัดไปเท่านั้น
            for (y = 1; y <= i; y++) {

                System.out.print("$");
                if(y<i)
                System.out.print(" ");
            }
            System.out.print("\n");// เว้นวรรค
        }
    }

}
