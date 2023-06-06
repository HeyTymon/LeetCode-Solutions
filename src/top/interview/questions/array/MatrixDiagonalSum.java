package top.interview.questions.array;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {

        int primaryDiagonal = 0, secondaryDiagonal = 0;
        int middle = (mat.length % 2 == 0) ? mat.length/2 : mat.length/2 + 1;

        for (int i = 0; i < mat.length; i++) {
            primaryDiagonal += mat[i][i];

            int j = mat.length - 1 - i;
            if(i != j)  secondaryDiagonal += mat[i][j];
        }

        System.out.println(primaryDiagonal);
        System.out.println(secondaryDiagonal);

        return primaryDiagonal + secondaryDiagonal;
    }

    public static void main(String[] args) {
        diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }
}
