import java.util.*;
class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("nikhil"); 
          int front =0;
          int end =name.length()-1;
          System.out.println(name);
          for(int i =0;i<name.length()/2;i++){
             char temp = name.charAt(front);
            name.setCharAt(front, name.charAt(end));
            name.setCharAt(end, temp);

            front++;
            end--;

        }
        System.out.println(name);
    }
}