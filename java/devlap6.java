import java.util.Scanner;
import java.util.stream.IntStream;

public class devlap6 {
    //เครื่องคิดเลขลุงสมหมาย
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time =sc.nextInt();
        int[] cel = new int[time];

        for(int i=0;i<time;i++)
        cel[i] = sc.nextInt();

        System.out.println(IntStream.of(cel).sum()+" THB");//คือคำสั่ง + บวกทั้งหมดใน array


    }
}
