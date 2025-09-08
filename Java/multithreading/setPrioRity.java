public class setPrioRity extends Thread  {
    public setPrioRity(String name){
        super(name);
    }
    public void run(){
        for(int i =0; i<10; i++){
            
            String a= " ";
            for(int j=0;j<100000;j++){
                a+="a";
                //do nothing
            }
            System.out.println(setPrioRity.currentThread().getName() +"priority: "+Thread.currentThread().getPriority()+ "count" + i);
        }

    }
public static void main(String[] args) {
        setPrioRity sPrioRity = new setPrioRity("low priority");
        setPrioRity mPrioRity = new setPrioRity("medium priority");
        setPrioRity lPrioRity = new setPrioRity("high priority");
        sPrioRity.setPriority(Thread.MIN_PRIORITY);
        sPrioRity.setPriority(Thread.NORM_PRIORITY);
        sPrioRity.setPriority(Thread.MAX_PRIORITY);
        sPrioRity.start();
        mPrioRity.start();
        lPrioRity.start();
    }

}
