public class threads extends Thread {
    public void run() {
        System.out.println("Thread is running.....");
        for (int i = 1; i < 5; i++) {
            System.out.println("Thread is running " + i);
            try {
                Thread.sleep(5);  // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        threads t1 = new threads();  //new thread object
        t1.start();  // runnable thread
        t1.join();
        System.out.println("Thread 1 state after join: "+ t1.getState());

        
    }

}
