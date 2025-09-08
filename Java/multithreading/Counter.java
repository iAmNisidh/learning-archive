public class Counter {
    private int count = 0;

    // Make inc() public so it can be accessed from Mythreeed
    public synchronized  void inc() {  //this is the critical section 
        count++;
    }

    public int getCount() {
        return count;
    }
}
