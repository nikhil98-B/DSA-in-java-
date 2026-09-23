import java.util.Scanner;

class Subarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        }            System.out.println("here are the elements : ");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        System.out.print("enter the size of the subarray  : ");
         int arr_sec[] = new int[sc.nextInt()];
        for(int i=0;i<arr_sec.length;i++){
            System.out.print("enter the elements of subarray : ");
            arr_sec[i] = sc.nextInt();
        } 
         System.out.println("here are the elements : ");

        for(int i=0;i<arr_sec.length;i++){
            System.out.println(arr_sec[i]);
        }
        int count =0;
        boolean flag = true;
        for(int i=0;i<=arr.length-arr_sec.length;i++){
             
            for(int j =0;j<arr_sec.length;j++){
                if(arr[i]==arr_sec[j]){
                    count++;
                   
                }
               

            }
             
        }
         if(count==arr_sec.length){
                    System.out.println(flag);
                }
                else{
                    flag = false;
                    System.out.println(flag);
                }
    }
    
}
