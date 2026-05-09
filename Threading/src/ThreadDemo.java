public class ThreadDemo extends Thread{
    ThreadDemo(){}
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getName() +
                ", is Daemon: " + Thread.currentThread().isDaemon());
    }
    public void start(){
        super.start();
    }
}
class TestThread{
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo();
        ThreadDemo thread2 = new ThreadDemo();
        ThreadDemo thread3 = new ThreadDemo();
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}