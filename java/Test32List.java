
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test32List { 
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String[] customerProducts = new String[5];
    customerProducts[0] = scn.nextLine(); 
    customerProducts[1] = scn.nextLine(); 
    customerProducts[2] = scn.nextLine(); 
    customerProducts[3] = scn.nextLine(); 
    customerProducts[4] = scn.nextLine(); 
    foundProduct(customerProducts); //สั่งให้ method ทำงานและส่งข้อมูล customerProducts ไป
    }
    private static void foundProduct(String[] customerProducts) 
    {
        //int found = 0;
        List product = Arrays.asList(new String[]{"ham","ขยะ"}); //คำสั่งลิสคือจะช่วยประหยัดพื่นที่ในการค้นหาของในนั้น //คือการกำหนดค่าที่อยู่ใน list
        for (int i = 0;i<customerProducts.length;++i){  //.length คือค่าที่บอกว่า Array นี้มีความจุเท่าไหร่
            if(product.contains(customerProducts[i])) //ถ้าเจอตัวที่อยู่ใน list product ก็จะทำงาน
            {
           // found +=1;
             System.out.println("found! "+customerProducts[i]);
            }
    }
    //if(found == 0)
   // {
       // System.out.println("Not found! ");
    //}
}
}
     
    
