public class yeild extends Thread  {
    public yeild(String name){
        super(name);
       
    }
    @Override
    public void run(){
        for(int i= 0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " is running " +"Count:" +i);
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        yeild obj = new yeild("Thread-1");
        yeild obj1 = new yeild("Thread-2");
        // System.out.println("Thread 1 state: " + obj.getState());
        // System.out.println("Thread 2 state: " + obj1.getState());
        obj.start();
        obj1.start();
    }
    
}
