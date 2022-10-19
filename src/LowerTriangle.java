public class LowerTriangle {
    public static void main(String Args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        System.out.println("\t First Martix ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + a[i][j]);

            }
            System.out.println();
        }

        System.out.println("\t Lower triangle Martix ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if( i<j){
                    System.out.print("\t");}
                else
                {System.out.print("\t" + a[i][j]);
                    sum=sum+a[i][j];}
            }
            System.out.println();
        }

        System.out.println("\n sum ="+sum);
    }
}
