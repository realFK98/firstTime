

//public คือ เป็นการอนุญาติให้คลาสอื่นนำ method นี้ไปใช้ในคลาสอื่นได้
public class Test25{ 
     public static void main(String[] args) {
       Test25human human = new Test25human();//ต้องกำหนดค่าตัวแปรหากมีการเรียกใช้จากคลาสอื่น
       //คือการเรียกใช้ field จากคลาสอื่่น
       human.nickName = "5555"; //ข้อมูลสามรถถูกแปลียนได้
       System.out.println(human.name); 
       human.hello();
       System.out.println(""); 
       System.out.println(human.onlygetname());  //แบบนี้สามารถเรียกใช้ได้อย่างเดียวเท่านั้น
     }
    }
  
   