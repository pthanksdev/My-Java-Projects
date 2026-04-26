import java.util.*;

public class Employee {
        public static void main(String[] args) {
 //           Scanner scanner = new Scanner(System.in);
   //         int choice;
            Map<String , NIIT> employee = new TreeMap<>();
            employee.put("001",new NIIT("001","Vivian",22));
            employee.put("002",new NIIT("002","Dolapo",78));
            employee.put("003",new NIIT("003","Emma",23));
            employee.put("004",new NIIT("004","Ebuka",56));
            employee.put("005",new NIIT("005","Deji",27));
            for (Map.Entry<String,NIIT> entry : employee.entrySet()){
                System.out.println("ID: "+entry.getKey()+" ,Name: " + entry.getValue().getName()
                + " ,Age: " + entry.getValue().getName());
            }
           System.out.println(employee.size() + " Documents");
 //           System.out.println("Do you want to add another employee?\n1.yes/2.no");
 //           choice = scanner.nextInt();
 //           switch (choice){
 //               case 1:
 //                   String response
  //          }

        }
    }
class NIIT{
    private String ID;
    private String Name;
    private Integer Age;

    public NIIT(String ID,String Name,int Age){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }
    public String getID(){return ID;}
public String getName(){return Name;}
public Integer getAge(){return Age;}

//public class Employ1{
 //       Scanner scanner = new Scanner(System.in);
 //           String Name,ID;
 //           int Age;
 //           HashSet<Scanner,Scanner>
    }



