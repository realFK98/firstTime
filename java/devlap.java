import java.util.Scanner;
//ReverseThe
public class devlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split(" ");
        for(int i = text.length-1;i>=0;i--)
        {
            System.out.print(text[i]+" ");
        }
        


    }
}
