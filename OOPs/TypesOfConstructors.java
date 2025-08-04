public class TypesOfConstructors {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Mugdha");
        Student s3=new Student(123);
    }
}
class Student
{
    int roll;
    String name;
    Student()//Non-parametrized constructor
    {
        System.out.println("Constructor is called..");
    }
    Student(String name)//Parametrized
    {
        this.name=name;
    }
    Student(int roll)//Parametrized
    {
        this.roll=roll;
    }
}
