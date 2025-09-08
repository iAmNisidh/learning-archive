public class setDemonn extends Thread { 
    @Override
    public void run() {
        // Implement thread logic here
        while (true) {
            System.out.println("Thread is running...");  
        }
    }
    public static void main(String[] args) {
       setDemonn t1 = new setDemonn();
       setDemonn t2 = new setDemonn();  //t2 is a user thread not demon
       t2.start();
       t1.setDaemon(true); // Set the thread as a daemon thread
       t1.start();
       System.out.println("main done");
       // t1.setDaemon(false); // Uncommenting this line will throw an IllegalThreadStateException

    }
    
}
