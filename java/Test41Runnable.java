

public class Test41Runnable implements Runnable {
  private String threadname;
  private Thread t;
  @Override
  public void run() {
    System.out.println("Runing : " + threadname);
    for(int i = 4;i>0;i--)
    {
      System.out.println(threadname + " : "+ i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }
    
  }
  Test41Runnable(String name)
  {
    threadname = name;
    System.out.println("Creating: " + threadname);
  }
  public void start()
  {
    System.out.println("Starting: " + threadname);
    if(t == null)
    {
      t = new Thread(this, threadname);
      t.start(); //เมื่อเริ่มทำงานจะมำงานในส่วนของ run
    }
  }


}
