import java.util.*;

public class program_09{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int r= adi.nextInt();
        int c= adi.nextInt();

        int mat[][] =new int[r][c];
        int a[] =new int[r*c];
        int idx =0;
        for (int i = 0; i<r;i++) {
            for (int j = 0;j<c;j++) {
                mat[i][j] =adi.nextInt();
                a[idx++] =mat[i][j];
            }
        }
		System.out.println("1D Array: " + Arrays.toString(a));
    }
}
