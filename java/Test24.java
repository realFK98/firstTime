

//public คือ เป็นการอนุญาติให้คลาสอื่นนำ method นี้ไปใช้ในคลาสอื่นได้
public class Test24 { 
  
    private static void hello() { //คือคำสั้งการสร้างตัวแปร
      System.out.println("Hello");    //void คือเมื่อ Run codeโค้ดเสร็จจะไม่มีการส่งค่ากลับเมื่อเรียกใช้
      
    
    }
    private static String helloXD() {  //คือการส่งค่าเมื่อเรียกใช้ในรูปแบบ String   
      return "hello"; //คือคำสั่งที่จะส่งกลับเมื่อเรียกใช้
    
    }
    private static int ab(){ //ให้ประมวณในนี้
      int a = 5;
      int b = 6;
      return a+b;//พอเสร็จก็ส่งตำตอบนี้ไปหากมีการเรียกใช้
    }
    public static void main(String[] args){ 
      hello(); // การนำตัวแปรชุดคำสั่งมาใช้ต้องมี ชื่่อที่ตั้ง้(); 
      System.out.println(helloXD()); //นี่คือการเรียกใช่คำสั่ง ที่คำนวณมาจาก method นั้น
      System.out.println(ab());
      Test24Car car = new Test24Car(); //หากต้องการเรียกใช้ในคลาสอื่่นต้องสร้างตัวเปรชื่่อคลาสนั้นก่อน ดังนี้
     
      car.Start();  //หากอยากใช้ method ให้ตามด้วนตัวแปรที่ตั้งในคลาสตามด้วยชื่อmethodที่ต้องการ
    }
  }
  
   