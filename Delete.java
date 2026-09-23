import java.util.*;

public class Delete {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Largest subarray sum is: " + max);
    }
}