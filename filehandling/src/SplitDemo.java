import java.util.Locale;

public class SplitDemo {
    public static void main(String[] args) {
        String record = "1001,Smith,Delhi,76000";
        String empRecordDetail[] = record.split(",");
        System.out.println("Employee ID: " + empRecordDetail[0]);
        System.out.println("Employee Name: " + empRecordDetail[1]);
        System.out.println("Employee City: " + empRecordDetail[2]);
        System.out.println("Employee Salary: " + empRecordDetail[3]);
        System.out.println("Jordan".toUpperCase());
        String studentId = "S221013500034";
        String yearJoined = studentId.substring(1, 3);
        System.out.println("Student Joined in the year: " + yearJoined);
        System.out.println("Student Joined in Center: " + studentId.substring(3, 8));
    }
}