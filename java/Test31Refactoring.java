import java.util.Scanner;

public class Test31Refactoring { //พยายามอย่าเอาทุกอย่างลง main ให้แยกองค์ประกอบด้วย
    static Scanner scanner; //ทำให้ตัวแปรนี้ครอบคุมทุก mathod เวลาเรียกใช้
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        int userInput = displaymenu();
        gg(userInput);
        
        

    }
        

        
        private static int displaymenu()
            {
                System.out.println("My Calvulation 1.0 MENU");
                System.out.println("1 = VAT CALCULATOR");
                System.out.println("2 = BMI CALCULATOR");
                System.out.println("3 = A+B Problem");
                System.out.print("Pleast Enter Number : ");
                return scanner.nextInt();
            }
            
            private static void gg(int userInput)
            {
            if(userInput == 1)
            {
                VatCalculator();
            }
            else if(userInput == 2)
            {
                BMICALCULATOR();
            }
            else if(userInput == 3)
            {
                Problem();
            }
            else
            {
            System.out.println("Error !");
            }
            }
        private static void VatCalculator()
            {
                System.out.println("Mode : VAT CALCULATOR");
                System.out.print("Please Enter Price : ");
                double price = scanner.nextDouble();
                System.out.print("Please Enter VAT (%) : ");
                double vat = scanner.nextDouble();
                System.out.print("Result : " + ((price*vat/100)+price));
               
            }

            private static void BMICALCULATOR()
            {
                System.out.println("Mode : BMI CALCULATOR");
                System.out.print("Please Enter Weight : ");
                double weight = scanner.nextDouble();
                System.out.print("Please Enter Height");
                double height = scanner.nextDouble();
                System.out.print("Result : " + (weight/(height*height)));
            }    

            private static void Problem()
            {
                System.out.println("Moad : A+B Problem");
                System.out.print("Please Enter A value : ");
                double a = scanner.nextDouble();
                System.out.print("Please Enter B value : ");
                double b = scanner.nextDouble();
                System.out.print("Result : " + (a+b));
            }

             
        }
     
    
