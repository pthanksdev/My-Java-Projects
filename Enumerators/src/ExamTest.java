public class ExamTest {
    day Day;

    public ExamTest(day Day){
        this.Day = Day;
    }
    public void tellitlikethis(){
        switch (Day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:case SUNDAY:
                System.out.println("Weekends are the best");
                break;


            default:
                System.out.println("Middays are so-so");
                break;
        }
    }
   // public static void main(String[] args){
    //    ExamTest secondDay = new ExamTest(day.MONDAY);
  //      secondDay.tellitlikethis();
    //    ExamTest sixthDay = new ExamTest(day.FRIDAY);
      //  sixthDay.tellitlikethis();
    //    ExamTest firstDay = new ExamTest(day.SUNDAY);
      //  firstDay.tellitlikethis();
     //   ExamTest seventhday = new ExamTest(day.SATURDAY);
   //     seventhday.tellitlikethis();
    }
}
