public class classwork extends Thread{
    public void run(){
        System.out.println("running thread program : " + Thread.currentThread());
    }

    public static void main(String[] args) {
        classwork m1 = new classwork();
        classwork m2 = new classwork();
        classwork m3 = new classwork();
        m1.start();
        m2.start();
        m3.start();
    }
}
