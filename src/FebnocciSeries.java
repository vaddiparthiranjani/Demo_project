public class FebnocciSeries {
    public static void main(String Arg[])
    {
        int a,b,c,i,n=10;
        a=0;
        b=1;
        System.out.print(a+"\t"+b);
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
        }
    }
}
