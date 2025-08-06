public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="JSS Public School";
        Student s2=new Student();
        System.out.println(s2.schoolName);
        s2.schoolName="Silicon Valley";
        System.out.println(s1.schoolName);
    }
}
class Student
{
    String name;
    int roll;
    static String schoolName;
    String getname()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    static int percentage(int math,int chem,int phy)
    {
        return (math+chem+phy)/3;
    }
}
