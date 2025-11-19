public class TransposedMat {

    public static int[][] Transposed(int matrix[][]) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose matrix of size (cols x rows)
        int transposed[][] = new int[cols][rows];

        // Swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Printing the transposed matrix directly
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
        return transposed;

    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 7, 12},
            {13, 14, 7, 16}
        };
        Transposed(matrix);

    }
}
