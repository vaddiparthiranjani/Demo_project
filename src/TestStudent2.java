class Student {
         int id;
        String name;
    }
    class TestStudent2{
        public static void main(String args[]){
            Student s1=new Student(); //Initialization through reference
            s1.id=101;
            s1.name="Ranjani";
            System.out.println(s1.id+" "+s1.name);
        }
    }

