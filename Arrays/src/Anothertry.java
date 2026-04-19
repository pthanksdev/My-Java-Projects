public class Anothertry {
    public static void main(String[] args) {
        try {
            int x = 1/0;
            int testArray[];
            testArray = new int[3];
            testArray[0] = 1;
            testArray[1] = 2;
            testArray[2] = 3;
            System.out.println(x);
            System.out.println(testArray[2]);
        }catch (IndexOutOfBoundsException er){
            System.out.println("an out of bound occured");
        }catch (Exception er){
            System.out.println("An exception");
        }finally {
            int testArray[];
            testArray = new int[3];
            testArray[0] = 1;
            testArray[1] = 2;
            testArray[2] = 3;
            System.out.println(testArray[2]);
        }
    }
}


