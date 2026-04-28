public class Nestedforloop {
    public static void main(String[] args){
        int arr[][] = {{17,15,10},{13,17,13},{18,15,19}};
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++) {
                System.out.print(arr[i][j] + "");
            }
                System.out.println();

        }
    }
}
