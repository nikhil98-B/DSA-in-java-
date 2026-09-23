import java.util.Scanner;

class Position {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        }            

        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                System.out.print(arr[i]);
            }
             
            
        }

    }
}