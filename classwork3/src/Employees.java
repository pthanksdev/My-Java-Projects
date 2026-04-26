import java.security.interfaces.ECKey;

public class Employees {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    public Employees(String name,int age){
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show(){
        System.out.println("ID= " + ID + "\nName= " + name +
                "\nAge= " + age);
    }
    public void showNextId(){
        System.out.println("Next employee id will be =" + nextId);
    }
    protected  void finalize()
    {
        --nextId;
    }
}
 class UseEmployees{
     public static void main(String[] args) {
         Employees A = new Employees("Mr. Musa",56);
         Employees B = new Employees("MR. Idris",45);
         Employees C = new Employees("MRS. Ann",25);
         A.show();
         B.show();
         C.show();
         A.showNextId();
         B.showNextId();
         C.showNextId();
         {
             Employees X = new Employees("MR. Paul",23);
             Employees Y = new Employees("MR. Eniola",21);
             X.show();
             Y.show();
             X.showNextId();
             Y.showNextId();
             X = Y = null;
             System.gc();
             System.runFinalization();
         }
         A.showNextId();
     }
 }


