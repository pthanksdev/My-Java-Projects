abstract class Bike {
    Bike(){
        System.out.println("bike started");
    }
    abstract void run();
    abstract void stopped();
    abstract void ABS();
    void changeGear(){System.out.println("bike change gear");}
}
