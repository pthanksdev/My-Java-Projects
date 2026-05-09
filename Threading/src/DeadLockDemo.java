public class DeadLockDemo {
    private final String name;
    public DeadLockDemo(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public synchronized void call(DeadLockDemo caller){
        System.out.println(this.getName() + " Has asked to call me " +
                caller.getName());
        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        caller.callMe(this);
    }
    public synchronized void callMe(DeadLockDemo caller){
        System.out.println(this.getName() + " Has called me " + caller.getName());
      }

    public static void main(String[] args) {
        DeadLockDemo caller1 = new DeadLockDemo("Caller_1");
        DeadLockDemo caller2 = new DeadLockDemo("Caller_2");
        new Thread(new Runnable() {
            @Override
            public void run() {
                caller1.call(caller2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                caller2.call(caller1);
            }
        }).start();
    }
}
