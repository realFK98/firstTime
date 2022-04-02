
public class Test20Array { 
    public static void main(String[] args){ 
      int[] x = new int[10];                //[] คือaira คือตัวที่ไว้ใช่เก็บข้อมูลหลายๆตัวโดยต้องเป็นประเภทเดียวกัน
      for(int i=0;i<10;i++) 
                            //จะมีการจองพื้นที่ก่อนเพราะงั้นต้องกะขนาดให้ดี
      {
          x[i] = 5*(i+1);
          System.out.println(x[i]);

      }                     //ถ้ากำหนดaira[10]จะได้ลำดับดับตั้งแต่ 0-9 
    }
}