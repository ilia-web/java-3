public class lesson3_task4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr){
        int a = 0;
        for (int element: arr){
            a+=element;
        }
        return a;
    }
}
