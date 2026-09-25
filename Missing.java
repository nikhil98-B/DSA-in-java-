import java.util.*;
class Missing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size : ");
        int arr2[] = new int[sc.nextInt()];          
         
           System.out.println("here is the next array : ");
        for(int i=1;i<arr2.length;i++){
             System.out.println(i);    
        }
         
        int arr[] = new int[arr2.length-1];
        for(int i=0;i<arr.length-1;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        }  
        int count =0;
        for(int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]+1){
                    count++;
                    
                }

            }
            
        }  
        if(count ==arr.length){
            System.out.println("it is in range ");

        }
        else{
            System.out.println("not in the range ");
        }
        
             
            
            
        


         
}
}
