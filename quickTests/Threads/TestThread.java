public class TestThread {
  public static void main (String[] params) {
    new MyThread().start();
    MyThread test = new MyThread("Example Thread");
    test.start();
    System.out.println("End of the main Thread");
  }
}

class MyThread extends Thread {
  public MyThread(String text) {
    super(text);
  }

  public MyThread() { }

  public void run () {
    System.out.println("Thread being called:" + this.getName());
    System.out.println("Thread id:" + this.getId());
  }
}