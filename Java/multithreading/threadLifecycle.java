public class threadLifecycle extends Thread {
    // This method is called when the thread is started 
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break;  // Exit the loop if interrupted
            }
        }
        System.out.println("hello from hread");
        

        
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        threadLifecycle t1 = new threadLifecycle();  //new thread object
        System.out.println("Thread 1 state: " + t1.getState());
        t1.start();  // runnable thread
        System.out.println("Thread 1 state after start: " + t1.getState());
        Thread.sleep(100);  // sleep for 100 milliseconds
        System.out.println(t1.getState());
        t1.join();  // wait for thread to finish
        System.out.println("Thread 1 state after join: " + t1.getState());

        
    }

    

}
