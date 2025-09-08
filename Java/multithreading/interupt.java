public class interupt extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000);  // sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted"+e);
        }
        System.out.println("Thread is finished");
    }


    public static void main(String[] args) {
        interupt t1 = new interupt();  //new thread object
        System.out.println("Thread 1 state: " + t1.getState());
        t1.start();  // runnable thread
        t1.interrupt();  // interrupt the thread
        
        
    }
    
}
