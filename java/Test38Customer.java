import java.util.ArrayList;

public class Test38Customer { //คือการเก็บข้อมูลแบบเพิ่มได้เรื่อยๆ เช่นการสมัครสมาชิก
  private String name;
  public Test38Customer(String name)
  {
    setName(name);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  

}
