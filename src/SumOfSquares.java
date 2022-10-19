public class SumOfSquares {
    public static void main(String args[])
    {
        int i, sum=0;
        for(i=1;i<=10;i++)
        {
            System.out.println(i +"\t" + i*i);
            sum=sum+i*i;

        }
    System.out.println("sum of Squares "+ sum);
    }
}
