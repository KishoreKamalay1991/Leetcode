import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setmatriceszero {

    public static int[][] setzeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ( matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        System.out.println(rowSet);
        System.out.println(colSet);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;

    }


    public static void main(String[] args) {


        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};

       int res[][] = setzeros(matrix);

       System.out.println(Arrays.deepToString(matrix));


    }

}
