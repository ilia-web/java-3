public class lesson3_task5 {

    private static int sumEvens(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0 && i != 0)
                result += arr[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int evens = sumEvens(a);
        System.out.println(evens);
    }
}
