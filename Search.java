import java.util.*;;
class Search {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elements : ");
            arr[i] = sc.nextInt();
        } 
        System.out.print("enter the number to search :");
        int count =0;
        int tar = sc.nextInt();    
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                count++;
            }
        }
        if (count==1) {
            System.out.println("element is present");
            
        }
        else{
            System.out.println("element is not present ");
        }
}
}
