import javax.xml.datatype.DatatypeConstants;
import java.util.Date;
public class MyThread extends Thread {
    private String parameter;
    private static DatatypeConstants TimeUnit;
    public MyThread(String parameter) {
        this.parameter = parameter;
    }

    public void run() {
        while (!"exit".equals(parameter)) {
            System.out.println((isDaemon() ? "daemon" : " user") + " thread " + this.getName() + "(id=" + this.getId() + ")parameter: " + parameter);
            pauseOneSecond();
        }
        System.out.println((isDaemon() ? "daemon" : "user") + " thread " + this.getName() + "(id=" + this.getId() + ") parameter: " +
                parameter);
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    private static void pauseOneSecond() {
        try {
            TimeUnit.SECONDS.wait(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MyThread thr1 = new MyThread("One");
        thr1.start();
        MyThread thr2 = new MyThread("Two");
        thr2.setDaemon(true);
        thr2.start();
        pauseOneSecond();
        thr1.setParameter("exit");
        pauseOneSecond();
        System.out.println("Main thread exists");
    }


    class MyRunnable implements Runnable {
        private String parameter, name;

        public MyRunnable(String name) {
            this.name = name;
        }

        public void run() {
            while (!"exit".equals(parameter)) {
                System.out.println("thread " + this.name
                        + ", parameter: " + parameter);
                pauseOneSecond();
            }
            System.out.println("thread " + this.name + ", parameter: " + parameter);
        }

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }
    }

    public void main(String args) {
        MyRunnable myRunnable1 = new MyRunnable("One");
        MyRunnable myRunnable2 = new MyRunnable("Two");
        Thread thr1 = new Thread(myRunnable1);
        thr1.start();
        Thread thr2 = new Thread(myRunnable2);
        thr2.setDaemon(true);
        thr2.start();
        pauseOneSecond();
        myRunnable1.setParameter("exit");
        pauseOneSecond();
        System.out.println("Main thread exists");
    }
}