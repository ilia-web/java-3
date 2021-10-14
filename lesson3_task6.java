public class lesson3_task6 {
    private static int sumOdds(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0)
                result += arr[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int odds = sumOdds(a);
        System.out.println(odds);
    }
}
