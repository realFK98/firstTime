public class Test34Constructor{
   private  String name;
   private String lastname;
   private String address;
   private String k;

   public Test34Constructor(String name,String lastname,String address) //จะทำงานทันทีหลังมีการประกาศ object class นี้ ต้องตั้งชื่อเดียวกันกับคลาส
   {                                                    //เมื่อสร้าง object จะต้องส่งค่า flide ไปให้
        this.name = name;
        this.lastname = lastname;
        this.address = address;
   }
   public Test34Constructor()//สามารถตั้งชื่อเหมือนกันได้โดยห้ามจำนวน parameter เท่ากัน
    {
        System.out.println("hello");
    }
    public Test34Constructor(String name,String lastname)//Overloading มีจุดประสงค์คือ เพื่อที่จะเขียนฟังก์ชั้นที่มีการทำงานเหมือนกัน หรือเป้าหมายชนิดเดียวกัน แต่มีข้อมูล หรือ คำสั่งการทำงานที่แตกต่างกัน
    {
        System.out.println("hello " + name + " " + lastname);
    }
    
   public String getName()
   {
       return name;
   } 
   public void setName(String name)
   {
       this.name = name;
   }

   public String getLastName()
   {
       return lastname;
   } 
   public void setLastName(String lastname)
   {
       this.lastname = lastname;
   }

   public String getaddress()
   {
       return address;
   } 
   public void setaddress(String address)
   {
       this.name = address;
   }
    
}