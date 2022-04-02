
public class Test21Array { 
    public static void main(String[] args){ 
      int[] user = {10,20,30,40,50,60};    //เป็นการกำหนดค่าไว้เลยไม่จะเป็นต้องจำกัดเขต
      String[][] users = new String[10][5];     //เป็นairraแบบ 2 มิติ
      users[0][1] = "name";
      users[0][2] = "lastname";
      users[0][3] = "age";
      users[0][4] = "county";
      //
      users[1][1] = "name3";
      users[1][2] = "lastname2";
      users[1][3] = "age2";
      users[1][4] = "county2";
      int ii =0;
      int iii = 1;
      for(int i = 0; i<8; i++)
      {
        System.out.println(users[ii][iii]);
        iii+=1;
        if(iii==5)
        {
          ii+=1;
          iii-=4;
        }

      }
    }
  }