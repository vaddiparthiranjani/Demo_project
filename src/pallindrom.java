public class pallindrom {
    public static void main(String Args[])
    {
        int num,n,res=0,m;
        n=129;
        num=n;

        while(n>0)
        {
           m=n%10;
           res=(res*10)+m;
           n=n/10;
        }

        if (num == res)
            System.out.println("Number is Pallindrom");
        else
            System.out.println("Number is not Pallindrom");
    }

}
