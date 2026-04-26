public class student {
    private String Name;
    private int Age;
    private String Address;

    public String getName() {
        return Name;
    }

  public void setName(String name){
    Name = name;
 }

 public int getAge(){
     return Age;
    }

    public void setAge(int age){
     Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address){
        Address = address;
    }

    public student(String Name, int Age, String Address){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        }

        public static void main(String[] args){
    student mykel = new student("mykel", 20,"NO.23,Ikeja street");
            System.out.println(mykel.getName());
    System.out.println(mykel.getAge());
            System.out.println(mykel.getAddress());

        }
}
