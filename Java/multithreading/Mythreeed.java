public class Mythreeed extends Thread {

    private Counter counter;

    // Proper constructor (note the name matches the class!)
    public Mythreeed(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            synchronized (counter) {
                counter.inc();
            }
        }
    }
}
