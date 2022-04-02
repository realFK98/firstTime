

public class Test28human{ 
     private String name = "" ; 
     public void gethuman1(String name,String lastname,String age){ //พิมเขียว หากเรียกใช้ flide เหมือนกันมันจะเอาตัวที่ไกล้ที่สุดก่อน ยกเว้นใช้คำสั่ง this.ตามด้วยชื่อ = ตามด้วยชื่อ  มันจะเอาตัวบนแทน
          this.name = name;//ไว้กันให้เอาแค่ตัวแปรเฉพาะในนี้
          System.out.println("hello " + name + " " +lastname + " age " + age);
     }
     public void gethuman2(String name,String lastname,String age){ 
          this.name = name;
          System.out.println("hello " + name + " " +lastname + " age " + age);
     }
     public void gethuman3(String name,String lastname,String age){ 
          this.name = name;
          System.out.println("hello " + name + " " +lastname + " age " + age);
     }
    
}
