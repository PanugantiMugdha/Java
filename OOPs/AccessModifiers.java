public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount bk=new BankAccount();
        bk.username="Mugdha Panuganti";
        bk.setPassword("abcdefghi");
        System.out.println(bk.username);
        // System.out.println(bk.password);
    }
}
class BankAccount
{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password=pwd;
    }
}
