import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);
        for (int i = 0; i <= 4; i++)
            arrayList.add(i);
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i) + "");
        for (int i : arrayList)
            System.out.println(arrayList);
        for (int i = 0; i < 8; i++) {
            arrayList.add(i);
            System.out.println(arrayList);
        }
    }
}

