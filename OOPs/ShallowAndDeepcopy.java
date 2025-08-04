

public class ShallowAndDeepcopy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Mugdha";
        s1.roll=456;
        s1.marks[0]=100;
        Student s2=new Student(s1);
        s1.marks[0]=98;
        for(int i=0;i<1;i++)
        {
            System.out.println(s2.marks[0]);
        }

    }
}
class Student{
    int roll;
    String name;
    int marks[];
    // Student(Student s1)//Shallow copy constructor
    // {
    //     this.roll=s1.roll;
    //     this.name=s1.name;
    //     this.marks=s1.marks;
    // }
     Student(Student s1)//Deep copy constructor
    {
        marks=new int[3];
        this.roll=s1.roll;
        this.name=s1.name;
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s1.marks[i];
        }
        
    }
    Student() {
        // System.out.println("The constructor is called...");
        marks=new int[3];
    }
    Student(String name)
    {
        marks=new int[3];
        this.name=name;
    }

    Student(int roll)
    {
        marks=new int[3];
        this.roll=roll;
    }
    
    
}
