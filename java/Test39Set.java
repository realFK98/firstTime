import java.util.*;//ถ้าเป็น * จะเรียกใช้ทั้งหมด

public class Test39Set { //คือการเก็บข้อมูลแบบเพิ่มได้เรื่อยๆ เช่นการสมัครสมาชิก
  public static void main(String[] args) { // setหากตัวเหมือนกันจะนับเป็น 1
    Set<Integer> set = new HashSet<Integer>(); //Hashจะทำให้ set ใช้ได้ทันทีไม่ต้องเชื่อมกับ method
    set.add(5);
    set.add(6);              //.clear คือการล้างทั้งหมดใน set
    set.add(5);              //.isEmpty จะแสดงผลเป็น true หากไม่มีข้อมูลอยู่
    set.add(1);              //.remove(ตัวที่จะลบ) จะเป็นการลบตัวที่ต้องการ
    set.add(1);              //.size() จะบอกขนาดของ set นี้
    System.out.println(set); //[1, 5, 6]
  }

}
