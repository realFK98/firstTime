import java.util.ArrayList;
import java.util.Scanner;

public class devlap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList name = new ArrayList();
        ArrayList<Integer> age = new ArrayList();
        ArrayList sex = new ArrayList();
        for(int i =0;i<3;i++)
        {
            name.add(sc.nextLine());
            age.add((Integer.parseInt(sc.nextLine())-2017)*-1);
            sex.add(sc.nextLine());
        }
    System.out.println("--Customers Information--");
    for(int i =0;i<3;i++)
    System.out.println(name.get(i)+" (age : "+age.get(i)+")");

    }
}
