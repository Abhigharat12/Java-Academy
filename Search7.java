
// Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

public class Search7 {

    public static int Search7(int matrix[][],int element) {
        int row=matrix.length;
        int col=matrix[0].length;
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==element){
                    count++;
                }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 7, 12},
            {13, 14, 7, 16}
        };
        int element=12;

        System.out.println("Number of times " + element + " appears: " + Search7(matrix,element));
    }
}
