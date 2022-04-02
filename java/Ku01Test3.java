import java.lang.reflect.Array;
import java.util.Scanner;

public class Ku01Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] oriString;// ตัวบรรทัดแรก
        int[] oriint = new int[3];// นับ 0 ด้วย

        oriString = sc.nextLine().split(" ");
        for (int i = 0; i < 3; i++)
            oriint[i] = Integer.parseInt(oriString[i]);

        //รับค่า บรรทัดเดียวและแปลงเป็น int แบบ loop ---------------------------------------------

        String[] goSplit;// ตัวรับและส่งค่า
        int[] goInt = new int[oriint[0] * 3];// แปลงเป็น int 1 ตัวมี 3 ค่า n*3
        int t = 0;// ลำดับของค่าที่บันทึก

        for (int i = 0; i < oriint[0]; i++) {
            goSplit = sc.nextLine().split(" ");// รับ
            for (int ii = 0; ii < 3; ii++) {
                goInt[t] = Integer.parseInt(goSplit[ii]);
                t++;
            }
        }
        //------------------------------------------------------------------------------------
        for(int i = )
    }
}