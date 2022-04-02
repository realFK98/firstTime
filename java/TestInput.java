import java.util.Scanner;

public class TestInput {
    
    public static void main(String[] args) {
        inputGat();
        show();
        }
    private static void inputGat()
    {   
        Scanner sc = new Scanner(System.in); 
        thai = sc.nextDouble();
        math = sc.nextDouble();
        english = sc.nextDouble();
        science = sc.nextDouble();
        sport = sc.nextDouble();
    }
    private static double gat()
    {
    return (thai+math+english+science+sport)/5;
    }
    private static void show()
    {
        System.out.println("THAI = "+thai);
        System.out.println("MATH = "+math);
        System.out.println("ENGLISH = "+english);
        System.out.println("SCIENCE = "+science);   
        System.out.println("SPORT = "+sport);
        System.out.println("---");
        System.out.println("GPA = "+gat());
    }
    static Double thai;
    static Double math;
    static Double english;
    static Double science;
    static Double sport;
}
    

/*Tips:  Run for check input format*/
/*Tips:  Run for check input format*/