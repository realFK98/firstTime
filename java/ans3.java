import java.util.Scanner;

public class ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xx = sc.nextLine();
        int add = 0;
        String[] input;
        int x = Integer.parseInt(xx);
        int[] celculater1= new int[x];
        int[] celculater2= new int[x];
        int[] ans= new int[x];
        for(int i = 0;i<x;i++)
        {
            input = sc.nextLine().split(" ");
            celculater1[add] = Integer.parseInt(input[0]);//ซ้าย
            celculater2[add] = Integer.parseInt(input[1]);//ขวา
            add++;
        }
        for(int i = 0;i<x;i++)
        {
        int distance = 0;
        while(celculater1[i]!=celculater2[i])
        {
            if(celculater1[i]>celculater2[i]);
            
            
        }
    }
    }
}
