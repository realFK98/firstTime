import java.util.ArrayList;

public class Test38ArrayList { //คือการเก็บข้อมูลแบบเพิ่มได้เรื่อยๆ เช่นการสมัครสมาชิก
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();   //<หากพิมแบบนี้ต่อท้ายจะเป็นกาารกำหนดประเภทค่าที่ต้องการ>
    list.add("A");
    list.add("B");
    System.out.println(list.get(1));

    ArrayList<Test38Customer> listt = new ArrayList<Test38Customer>();   //<ตั้งเป็นคลาสได้>
    listt.add(new Test38Customer("A"));//สามารถสร้างค่าในนี้ได้เลย
    listt.add(new Test38Customer("B"));
    System.out.println(listt.get(0).getName());

  }
}
