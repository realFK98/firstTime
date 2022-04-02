public class Test36abstract{ //มีไว้กำหนดคำนิยามหากสืบทอดจากอันนี้จะต้องเขียน override ตัวแปรด้วย
   public static void main(String[] args) {
       Test36Animal animal = new Test36Hippo();
       animal.eat();
       animal.walk();

   }
}
