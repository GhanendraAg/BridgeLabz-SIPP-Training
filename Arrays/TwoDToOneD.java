package questions;
import java.util.*;
public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        int [][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int arr[] = new int[rows*columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
        sc.close();
    }
}