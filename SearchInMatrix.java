import java.util.*;
public class SearchInMatrix{
    public static boolean searchMatrix(int matrix[][],int target) {
        int rows = matrix.length; 
		int cols = matrix[0].length;
        int left = 0;
		int right = rows * cols - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];
            
            if (midElement == target) {
                return true;
            } 
			else if (midElement < target) {
                left = mid + 1;
            } 
			else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int rows = adi.nextInt();
        int cols = adi.nextInt();
        
        int matrix[][]= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = adi.nextInt();
            }
        }
		
        int target =adi.nextInt();
        
        boolean found = searchMatrix(matrix,target);
        System.out.println(found);
    }
}
