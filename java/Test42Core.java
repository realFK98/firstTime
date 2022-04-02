
import java.util.Random;
import java.util.Scanner;
//สร้างเกม
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FF
 */
public class Test42Core {
    private String vocap = "";//cat คำตอบ
    private String gameVocap = "";//c-t คำถาม
    private String lostChar = "";//ตัวที่หายไป
    private int life = 6;//ชีวิต
    
    public void getGameVocap()//สุ่มตัวที่จะตัดออก
    {
        Test42VocapList vocapList = new Test42VocapList();
        vocap =  vocapList.getrandomVocap();
        Random random = new Random();//สร้างตัวสุ่ม
        int n = random.nextInt(vocap.length());
        lostChar = vocap.charAt(n)+"";  //.charAt(ลำดับ) คือเอาตัวอักษรตัวเดียว //แปรค่าจาก Character เป็น String โดย + "" เข้าไป
        gameVocap = vocap.substring(0, n)+ "-"+vocap.substring(n+1,vocap.length()); //.substring(หน้า,หลัง) คือเลือกคำที่จะเอา
        
    }
    public void gameStart()
    {
        System.out.println(gameVocap);
        Scanner sc = new Scanner(System.in);
        while(life>=0){//ลูปที่ไม่รู้จำนวนครั้ง
        if(sc.nextLine().equals(lostChar))
        {
           System.out.println("Yeah! You are winner"); 
        }
        else if(life>0)
        {
            System.out.println("it's wrong try again : Life "+life);
            life--;
        }
        else
        {
            System.out.println("Game Over");
        }
    }
    }
}
