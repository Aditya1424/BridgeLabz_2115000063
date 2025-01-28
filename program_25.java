import java.util.*;
public class program_25{

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

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
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of matrix1 must be equal to rows of matrix2.");
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is not invertible.");
        }
        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1] / (double) determinant;
        result[0][1] = -matrix[0][1] / (double) determinant;
        result[1][0] = -matrix[1][0] / (double) determinant;
        result[1][1] = matrix[0][0] / (double) determinant;
        return result;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is not invertible.");
        }
        double[][] result = new double[3][3];
        result[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        result[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinant;
        result[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        result[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinant;
        result[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        result[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinant;
        result[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        result[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinant;
        result[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;
        return result;
    }

    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the matrices: ");
        int rows = adi.nextInt();
        int cols = adi.nextInt();

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nAddition of matrices:");
        int[][] sum = addMatrices(matrix1, matrix2);
        displayMatrix(sum);

        System.out.println("\nSubtraction of matrices:");
        int[][] diff = subtractMatrices(matrix1, matrix2);
        displayMatrix(diff);

        System.out.println("\nMultiplication of matrices:");
        try {
            int[][] product = multiplyMatrices(matrix1, matrix2);
            displayMatrix(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transpose1 = transposeMatrix(matrix1);
        displayMatrix(transpose1);

        if (rows == 2 && cols == 2) {
            System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1));
            try {
                double[][] inverse2x2Matrix = inverse2x2(matrix1);
                System.out.println("\nInverse of Matrix 1 (2x2):");
                for (int i = 0; i < inverse2x2Matrix.length; i++) {
                    for (int j = 0; j < inverse2x2Matrix[i].length; j++) {
                        System.out.print(inverse2x2Matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if (rows == 3 && cols == 3) {
            System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
            try {
                double[][] inverse3x3Matrix = inverse3x3(matrix1);
                System.out.println("\nInverse of Matrix 1 (3x3):");
                for (int i = 0; i < inverse3x3Matrix.length; i++) {
                    for (int j = 0; j < inverse3x3Matrix[i].length; j++) {
                        System.out.print(inverse3x3Matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
