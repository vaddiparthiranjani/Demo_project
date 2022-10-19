class Student1{
        int rollno;
        String name;
        void insertRecord(int r, String n){
            rollno=r;
            name=n;
        }
        void displayInformation(){System.out.println(rollno+" "+name);}
    }
    class TestStudent1{
        public static void main(String args[]){
            Student1 s1=new Student1();
            Student1 s2=new Student1();
            s1.insertRecord(111,"Ranjani"); // Initialization through method
            s2.insertRecord(222,"RaviRaj"); // Initialization through method
            s1.displayInformation();
            s2.displayInformation();
        }
}

