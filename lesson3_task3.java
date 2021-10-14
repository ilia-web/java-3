public class lesson3_task3 {
    private static int countEvens(int[] arr){
        int x = 0;
        for (int masiv: arr){
            if (masiv % 2 == 0)
                x++;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,12};
        int res = countEvens(arr);
        System.out.println(res);
    }
}
