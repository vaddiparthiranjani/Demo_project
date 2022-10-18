public class M_power_n {
    public static void main(String arg[])
    {
        int m=4,n=3,i,pow=1;
        for(i=1;i<=n;i++)
        {
            pow=pow*m;
        }
        System.out.println(m+" power "+n+" = "+pow);
    }
}
