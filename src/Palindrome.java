public class Palindrome {
    public static void main(String[] Args)
    {
        int num,n=129,res=0,m;
        num=n;

        while(n>0)
        {
           m=n%10;
           res=(res*10)+m;
           n=n/10;
        }

        if (num == res)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

}
