public class sincronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that share the same counter
        Mythreeed thread1 = new Mythreeed(counter);
        Mythreeed thread2 = new Mythreeed(counter);

        thread1.start();
        thread2.start();

    try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
