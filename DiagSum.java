/*
    🔹 Program: Diagonal Sum of a Square Matrix
    🔹 Author: Abhishek 
    🔹 Description:
       This program calculates the sum of both diagonals
       (primary ↘ and secondary ↙) of a square matrix.

       There are two approaches demonstrated:
       1️⃣ Brute Force (O(n²)): Checks all elements using nested loops.
       2️⃣ Optimized (O(n)): Uses a single loop to directly access diagonals.

       For example, given:
           1   2   3   4
           5   6   7   8
           9  10  11  12
           13 14  15  16

       Primary diagonal = 1 + 6 + 11 + 16 = 34
       Secondary diagonal = 4 + 7 + 10 + 13 = 34
       Total diagonal sum = 68
*/

public class DiagSum {

    // 🔸 Approach 1: Brute Force (Nested Loops)
    // Time Complexity: O(n²)
    // This checks every element to see if it belongs to a diagonal.
    public static int DiagonalSum_BruteForce(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                // Primary diagonal: i == j
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secondary diagonal: i + j == n - 1
                else if (i + j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    // 🔸 Approach 2: Optimized (Single Loop)
    // Time Complexity: O(n)
    // This directly picks diagonal elements using index patterns.
    public static int DiagonalSum_Optimized(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element (avoid double-counting middle in odd matrices)
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }

        return sum;
    }

    // 🔹 Main Method to Test Both
    public static void main(String[] args) {

        // 4x4 Example Matrix
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };

        // Call both methods and print results
        System.out.println("Brute Force Diagonal Sum = " + DiagonalSum_BruteForce(matrix));
        System.out.println("Optimized Diagonal Sum   = " + DiagonalSum_Optimized(matrix));
    }
}
