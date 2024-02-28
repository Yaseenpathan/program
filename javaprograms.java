public class MatrixAddition {
    public static void main(String[] args) {
        // Define matrices to represent numbers
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        // Perform addition
        int[][] result = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Result of addition:");
        displayMatrix(result);
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
   

