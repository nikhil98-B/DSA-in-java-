import java.util.*;
class Key{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[5];
        for(int i = 0;i<arr.length;i++){
            System.out.print("enter the elemenst : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("here is the element");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.print("enter the element u want u search : ");
        int key  = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("found at " + i);
            }
        }
        
         


    }
}