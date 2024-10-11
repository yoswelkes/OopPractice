package algorithms;

public class MatrixTrimmerMaxFInder {
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        // Iterate over each cell where a 3x3 matrix can be centered
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                // Find the maximum value in the 3x3 matrix centered at grid[i+1][j+1]
                int maxValue = Integer.MIN_VALUE;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        maxValue = Math.max(maxValue, grid[x][y]);
                    }
                }
                // Assign the maximum value to the result matrix
                maxLocal[i][j] = maxValue;
            }
        }

        return maxLocal;
    }

    // Test the implementation with the provided examples
    public static void main(String[] args) {
        int[][] grid1 = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };
        int[][] result1 = largestLocal(grid1);
        printMatrix(result1);

        int[][] grid2 = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        int[][] result2 = largestLocal(grid2);
        printMatrix(result2);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
