
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FF
 */
public class Test42VocapList {
    private String[] vocaps = {"cat","dog","fish","pig"}; //สร้าง Array คำศัพท์

    /**
     * @return the vocap
     */
    public String[] getVocaps() { //เรียกใช้ทั้งหมด
        return vocaps;
    }
    public String getVocap(int index){ //เรียกใช้ตัวเดียว
        return vocaps[index];
    }
    public String getrandomVocap(){
        Random random =new Random();//สุ่ม
        int n = random.nextInt(vocaps.length); //.length ขนาดของ Array
        return getVocap(n); //สุ่มเรียก Array 1 ตัว
    
    }
}
