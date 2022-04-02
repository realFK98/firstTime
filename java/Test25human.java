

//public คือ เป็นการอนุญาติให้คลาสอื่นนำ method นี้ไปใช้ในคลาสอื่นได้
public class Test25human { 
      //Field คือตัวแปรหนึ่งตัวที่ระบุขอบเขตไว้ด้วยmodifiler                         
      public  String nickName = "poooopppo";   //หากเป็นแบบนี้ข้อมูลจะสามารถเรียกใช้และถูกเปลียนได้
      public void hello() {
        System.out.print("hello "+name);
      }
      private  String realname = "wichira";//แบบนี้สามารถเรียกใช้ได้อย่างเดียวเท่านั้น
      private  String lastname = "Matrakampa";
      private  String age = "17";
      public String onlyGetName() //ชื่อไว้สำหรับเรียกใช้
      {
        return realname;
      }
      public String getLastname() 
      {
        return lastname;
      }
      public String getAge() 
      {
        return age;
      }

    }
  
   