import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;

public class classwork2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(73);
        numbers.add(3);
        numbers.add(9);
        numbers.add(43);
        numbers.add(16);
        numbers.add(18);
        numbers.add(5);
        numbers.add(23);
        numbers.add(1);
        Iterator<Integer> it = numbers.iterator();
                while(it.hasNext()){
                    Integer i = it.next();
                    if (i<10){
                        it.remove();
                    }
        //Collections.sort(numbers);
       // for (int i : numbers) {
         //   System.out.println(i);
        }
        System.out.println(numbers);
    }
}

