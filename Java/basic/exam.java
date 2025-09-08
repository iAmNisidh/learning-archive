
// public class exam {     
//     public static void Reverse(int arr[], int i, int j)
//     {
//         if(i < j && i < arr.length && j >= 0)
//         {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             Reverse(arr, i+1, j-1);
//         }
        
//     }
    
    
//     public static void main(String args[]) { 
//         int arr[]  = new int []{3,7,1,10,2,6,12};
        
        
//         for(int i=0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");
//         System.out.println("");
//         Reverse(arr, 0, arr.length-1);
//         for(int i=0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");
//     }
// } 
import java.util.Scanner;

class MatrixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
