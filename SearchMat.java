/*
    🔹 Program: Search an Element in a Sorted 2D Matrix
    🔹 Description:
       Given a matrix where each row and each column is sorted in ascending order,
       this program searches for a given key efficiently using the
       "staircase search" method (O(n + m) time).

       Strategy:
       - Start from top-right corner
       - If current element == key → found
       - If key < current element → move left
       - If key > current element → move down
*/

public class SearchMat {

    // Method to search key in sorted matrix
    public static boolean SearchMatElem(int matrix[][], int key) {
        int row = 0;                         // start from top row
        int col = matrix[0].length - 1;      // start from last column (top-right corner)

        // Continue while indices are valid
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("✅ Key found at position: (" + row + ", " + col + ")");
                return true;
            } 
            else if (key < matrix[row][col]) {
                // If key is smaller, move left
                col--;
            } 
            else {
                // If key is larger, move down
                row++;
            }
        }

        System.out.println("❌ Key not found in the matrix.");
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Searching for key
        SearchMatElem(matrix, 11);   // Expected output: found at (2, 2)
    }
}
