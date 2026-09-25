import java.util.*;
 class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        } 
        System.out.println("enter the target : ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    flag = true;
                    

                }

                 
                
            }
        }
         System.out.println(flag);

    }   
}
