package Thingstocheck;

public class matrix {

    public static void main(String[] args) {

        int mat[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int rowlength = mat[0].length;
        int collength = mat.length;

        for (int i = 0; i < rowlength; i++) {
            for (int j = 0; j < collength; j++) {
                System.out.println(mat[i][j] + " ");
            }

        }

    }

}
