import java.util.*;

class Matrix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        // Taking input
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("Enter the value: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sorting all elements
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {

                for(int k = i; k < 2; k++) {
                    int start;
                    if(k==i){
                        start =j+1;
                    }
                    else{
                        start =0;
                    }
                    for(int l = start; l < 2; l++) {

                        if(matrix[i][j] > matrix[k][l]) {

                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }

        // Printing
        System.out.println("Sorted matrix:");

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}