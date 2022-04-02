import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.w3c.dom.Text;

public class Test43Write {
    public static void main(String[] args) {
        System.out.println(readFlie("Test.txt"));
    }

    private static void writeFlie(String content) {
        try {
            FileWriter fw = new FileWriter("Test.txt");// ชื่อไฟล์
            BufferedWriter bw = new BufferedWriter(fw);// ข้อมูลไฟล์
            bw.write(content);
            System.out.println("Done");
            bw.close();// สั่งปิดด้วย
            fw.close();
        } catch (IOException e) // ตัวแปรของจุดที่ Error
        {
            e.printStackTrace();// แสดงโค้ดว่าผิดตรงไหน
        }
    }

    private static String readFlie(String file) {
        String text = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp;

            while ((temp = br.readLine()) != null) {
                text += temp;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;

    }
}
