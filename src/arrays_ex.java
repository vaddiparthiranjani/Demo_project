public class arrays_ex {
public static void main(String args[])
{
    int ar[][]={{2,3,4},{5,6,7},{9,8,7}};
    int max=0;
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++) {
            System.out.print("\t"+ar[i][j]);
            if (max <=ar[i][j])
                max=ar[i][j];
        }
    System.out.println();
    }
System.out.println("max = "+ max);
}
}
