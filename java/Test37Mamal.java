
public class Test37Mamal implements Test37InterfaceAnimal {

    @Override
    public void eat() {
      System.out.println("mamal eat ");
        
    }

    @Override
    public void traval() {
    System.out.println("mamal traval");
        
    } //หาต้องการใช้งานแบบ interface ต้องใช้คำสั่ง implement แทน extands
    
}
