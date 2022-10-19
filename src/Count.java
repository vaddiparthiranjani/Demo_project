class MyBook {
    int x=10;
    int y=8;
}

public class Count {
    public static void main (String [] args)
    {
        MyBook myobj1 = new MyBook();
        MyBook myobj2 = new MyBook();
        System.out.println (myobj1.x);
        System.out.println (myobj2.y);
    }
}
