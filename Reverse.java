import java.util.Scanner;

class Reverse  {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        }            System.out.println("here are the reverse array  : ");
      int start =0;
      int end = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
             start++;
             end--;
             
           
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}