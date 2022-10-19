public class MatrixMultiplication {
    public static void main(String args[]) {
        int ar1[][] = {{2, 3, 4}, {5, 6, 7}, {9, 8, 7}};
        int ar2[][] = {{1, 2, 3}, {2, 4, 5}, {5, 6, 7}};
        int ar3[][]=new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    ar3[i][j] = ar3[i][j] + ar1[i][k] * ar2[k][j];
                }

            }

        }
        System.out.println("\t First Martix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + ar1[i][j]);

            }
            System.out.println();
        }
        System.out.println("\t Second Martix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + ar2[i][j]);

            }
            System.out.println();
        }
        System.out.println("\t product Martix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + ar3[i][j]);

            }
            System.out.println();
        }
    }
}