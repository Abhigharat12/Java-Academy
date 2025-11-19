/*
    🔹 Program: Find the Sum of a Specific Row in a Matrix
    🔹 Description:
       This program takes a 2D matrix and a row index as input,
       and calculates the sum of all elements present in that specific row.

       Example:
       Matrix:
         1  2  3  4
         5  6  7  8
         9 10  7 12
        13 14  7 16

       For row index = 2 (3rd row),
       Row elements = 9, 10, 7, 12
       Row sum = 38
*/

public class RowSum {

    // 🔸 Method to calculate sum of a given row
    public static int RowSum(int matrix[][], int row) {
        int sum = 0;

        // Loop through all columns of the given row
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }

        return sum;
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 7, 12},
            {13, 14, 7, 16}
        };

        int targetRow = 2; // row index to find sum of (0-based indexing)

        System.out.println("Matrix row to sum: " + targetRow);
        System.out.println("✅ Sum of row " + targetRow + ": " + RowSum(matrix, targetRow));
    }
}
