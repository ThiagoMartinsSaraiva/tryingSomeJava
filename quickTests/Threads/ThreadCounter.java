public class ThreadCounter {
  public static void main(String[] args) {
    Counter c = new Counter();
    new Thread(c).start();
  }
}

class Counter implements Runnable {
  static int counter = 0;

  public void run() {
    while (counter++ < 10) {
      System.out.println("Counter:" + counter);
      try {
        Thread.sleep(500 * (int)(Math.random() * 5 + 1));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Count end");
  }
}