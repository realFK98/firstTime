

public class Test6 {
    public static void main(String[] args){ 
        //สินค้าหักภาษี
        float price = 1000f; //ราคา
        float vat = 10.00f/100f; //ภาษี
        float total = ((price*vat)+price);
        System.out.println(total);
        
    }
    
}
