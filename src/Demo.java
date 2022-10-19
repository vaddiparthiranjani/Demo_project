public class Demo {
    String name;
    int empid;
    public void get_data()
    {
    name="ranjani";
    empid=1122;

    }
    public void put_data()
    {
        System.out.println("name :"+ name);
        System.out.println("Emp ID :"+ empid);
    }

    public static void main(String args[])
    {
    Demo obj= new Demo();

    obj.get_data();
    obj.put_data();

    }
}
