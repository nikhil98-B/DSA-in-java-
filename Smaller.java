import java.util.Scanner;

class Smaller {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int arr [] = new int[5];
        for(int i =0;i<arr.length;i++){
            System.out.print("enter the values : ");
            arr[i] = sc.nextInt();

        }
        System.out.print("here are the elements ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }System.out.print("enter the key : ");
        int x = sc.nextInt();
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] <= x){
               count++;
                 
            }
           
        }
        System.out.println(count  + " smallest element ");

    }
    
}
