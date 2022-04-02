


public class Test33Static { 
   
   public static void main(String[] args) { //หากไม่มี Static จะทำให้กำหนดobjectมาได้หลายอัน 
                                            //หากมีจะทำให้สามารถเปลี่ยนค่า name เป็นอย่างอื่นได้เหมาะกับการใช้อันเดียว

       Test33Staticc Test13 = new Test33Staticc();
       Test13.setname("555");//กำหนดค่า
       System.out.println(Test13.getname());//ใช้ค่านั้น

       Test33Staticc Test13v2 = new Test33Staticc();

       Test13v2.setname("66");//กำหนดค่า
       System.out.println(Test13v2.getname());//ใช้ค่านั้น
   }

}
     
    
