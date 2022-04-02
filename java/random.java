import java.util.HashMap;
import java.util.Map;

public class random {
    public static void main(String[] args) {
        Map map1 = new HashMap(); 
        map1.put(1, "1");
        map1.put(2, "4");
        map1.put(3, "5");
        map1.put(4, "9");
        Map map2 = new HashMap(); 
        map2.put(1, "1");
        map2.put(2, "4");
        map2.put(3, "5");
        map2.put(4, "9");
        Map map3 = new HashMap(); 
        map3.put(1, "1");
        map3.put(2, "4");
        map3.put(3, "5");
        map3.put(4, "9");
        Map map4 = new HashMap(); 
        map4.put(1, "1");
        map4.put(2, "4");
        map4.put(3, "5");
        map4.put(4, "9");

        int x = 1;
        int y = 2;
        int a = 3;
        int d = 4;  

        for(int i = 1;i<=4;i++)
        {
            System.out.print(map1.get(x));
            System.out.print(map2.get(y));
            System.out.print(map3.get(a));
            System.out.print(map4.get(d));
            System.out.println(" ");
            System.out.print(map1.get(x));
            System.out.print(map2.get(y));
            System.out.print(map3.get(d));
            System.out.print(map4.get(a));
            System.out.println(" ");
            System.out.print(map1.get(x));
            System.out.print(map2.get(a));
            System.out.print(map3.get(y));
            System.out.print(map4.get(d));
            System.out.println(" ");
            System.out.print(map1.get(x));
            System.out.print(map2.get(a));
            System.out.print(map3.get(d));
            System.out.print(map4.get(y));
            System.out.println(" ");
            System.out.print(map1.get(x));
            System.out.print(map2.get(d));
            System.out.print(map3.get(a));
            System.out.print(map4.get(y));
            System.out.println(" ");
            System.out.print(map1.get(x));
            System.out.print(map2.get(d));
            System.out.print(map3.get(y));
            System.out.print(map4.get(a));
            System.out.println(" ");
            x+=1;
            y+=1;
            a+=1;
            d+=1;
            if(x>=5)
            {
                x=1;
            }
            if(y>=5)
            {
                y=1;
            }
            if(a>=5)
            {
                a=1;
            }
            if(d>=5)
            {
                d=1;
            }

            
        }
    }
}
