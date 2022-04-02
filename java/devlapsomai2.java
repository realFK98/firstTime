import java.util.Scanner;

public class devlapsomai2 {
    public static void main(String[] args){ 
        
      
		 Scanner name1 = new Scanner(System.in);
         Scanner name2 = new Scanner(System.in);
      Scanner Address1 = new Scanner(System.in);
     Scanner Gender1 = new Scanner(System.in);
      Scanner Tel1 = new Scanner(System.in);
          String n1 = name1.nextLine();
          String n2 = name2.nextLine();
      String Address = Address1.nextLine();
      String Gender = Gender1.nextLine();
      String Tel = Tel1.nextLine();
  
             System.out.println("--- Customer Detail ---");
         System.out.println("Name : " +n1+" "+n2);
         System.out.println("Address : " + Address);
         System.out.println("Gender : " + Gender);
       System.out.println("Tel : "+ Tel);
    }
    
}
