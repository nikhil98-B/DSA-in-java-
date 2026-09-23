import java.util.*;
class Missing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        }             
          boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]+1){
                 flag = true;

            }
        }
            if(flag){
                System.out.println("it is in range ");
            }
            else{
                System.out.println("not in the range ");
            }
            
            
        


         
}
}
