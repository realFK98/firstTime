

public class Test27{ 
    public static void main(String[] args) { //ค่าที่ใส่ในตัวแปรเช่น "name" เรียกว่า Argument
     Test25human human = new Test25human();
          //คือการสั่งให้ method hello ทำงานหร้อมส่ง filed ให้
         hello(human.onlyGetName(),human.getLastname(),human.getAge());
    }         
    //ค่าที่รับจากตัวแปรเรียกว่า Parameter
    private static void hello(String nickName,String lastname,String age){  // (String name) คือคำสั่งรอรับค่าที่ส่งมาและทำงาน
         System.out.println("Hello " + nickName + " " + lastname +" age " + age);
    }
    }
  
   