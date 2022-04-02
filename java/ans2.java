import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int xx = Integer.parseInt(x);
        String[] input;
        int[] celculater1 = new int[4];
        for (int i = 0; i < xx; i++) {

            input = sc.nextLine().split(" ");//ใส่หลายขั้น

            for (int ii = 0; ii < 4; ii++)
                celculater1[ii] = Integer.parseInt(input[ii]);

            int[] celculater2 = new int[celculater1[0]];
            input = sc.nextLine().split(" ");

            for (int ii = 0; ii < celculater1[0]; ii++)
                celculater2[ii] = Integer.parseInt(input[ii]);

            Arrays.sort(celculater2);

            int money, less, more, n = 0;
            less = celculater1[1];
            more = celculater1[2];
            money = celculater1[3];

            for (int ii = 0; ii < celculater2.length; ii++) {
                if (money > 0 && money >= celculater2[ii]) {

                    if (less <= celculater2[ii] && celculater2[ii] <= more) {
                        money -= celculater2[ii];
                        n++;
                    }
                }
            }
            System.out.println(n);
        }

    }

}
