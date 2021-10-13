import java.util.Scanner;
public class lesson3_task1 {

    private static boolean contains(int x, int[] arr){
        for(int i = 0; i < arr.length; i++){
            int age = arr[i];
            if (x == age){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] ages = {13, 14, 15, 11, 18, 21, 24};
        boolean result = contains(x, ages);
        if (result){
            System.out.println("შეიცავს");
        }else {
            System.out.println("არ შეიცავს");
        }
    }
}
