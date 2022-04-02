

public class Test41MultiThreading{  //คือการสั่งให้ method ทำงานพร้อมกัน
 
   public static void main(String[] args) {
     Test41Runnable run1 = new Test41Runnable("Thread one");
     run1.start();

     Test41Runnable run2 = new Test41Runnable("Thread two");
     run2.start();
   }
}
