public abstract class Test36Animal { //มีไว้กำหนดคำนิยามหากสืบทอดจากอันนี้จะต้องเขียน override ตัวแปรด้วย
    private String name;                //จะไม่มีการกำหนดว่าทำงานยังไง ที่จะกำหนดคือตัวที่สืบทอด
    private String dnaCode;

    public void eat()
    {
        System.out.println("Status : Eating");
    }
    public abstract void walk();
}
