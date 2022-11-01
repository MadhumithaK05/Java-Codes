import java.util.*;
class SignUp{
    public static void main(String[] args)
    {
        System.out.println("SignUp");
        System.out.print("Id : ");
        Scanner sc=new Scanner(System.in);
        String uid=sc.nextLine();
        System.out.println();
        System.out.print("Password : ");
        String pwd=sc.nextLine();
        System.out.println();
        check(pwd);

    }
    public static void check(String pwd)
    {
        int l=pwd.length();
        int cntd=0;
        int cntlc=0;
        int cntuc=0;
        int cnts=0;
        for(int i=0;i<=9;i++)
        {
            String s3=Integer.toString(i);
            if(pwd.contains(s3))
            {
                cntd++;
            }
        }
        if (   pwd.contains("@") || pwd.contains("#") 
            || pwd.contains("!") || pwd.contains("~")
            || pwd.contains("$") || pwd.contains("%")
            || pwd.contains("^") || pwd.contains("&")
            || pwd.contains("*") || pwd.contains("(")
            || pwd.contains(")") || pwd.contains("-")
            || pwd.contains("+") || pwd.contains("/")
            || pwd.contains(":") || pwd.contains(".")
            || pwd.contains(",") || pwd.contains("<")
            || pwd.contains(">") || pwd.contains("?")
            || pwd.contains("|")) {
                    cnts++;
            }
        for(int i=65;i<=90;i++)
        {
            char c1=(char)i;
            String s1=Character.toString(c1);
            if(pwd.contains(s1))
            {
                cntuc++;
            }
        }
        for(int i=97;i<=122;i++)
        {
            char c2=(char)i;
            String s2=Character.toString(c2);
            if(pwd.contains(s2))
            {
                cntlc++;
            }
        }
        if(l<=8 || l>=20)
        {
            disp(1);
        }
        if(pwd.contains(" "))
        {
            disp(7);
        }
        if(cntd==0)
        {
            disp(2);
        }
        if(cntlc==0)
        {
            disp(4);
        }
        if(cntuc==0)
        {
            disp(3);
        }
        if(cnts==0)
        {
            disp(5);
        }
        if(cntd>0 && cntuc>0 && cntlc>0 && cnts>0){
            disp(6);
        }
    }
    public static void disp(int n)
    {
        switch(n)
        {
            case 1:
                System.out.println("The password should contin atleast 8 characters and atmost 20 characters");
                break;
            case 2:
                System.out.println("The password should contain atleast one digit");
                break;
            case 3:
                System.out.println("The password should contain atleast one uppercase Letter");
                break;
            case 4:
                System.out.println("The password should contain atleast one Lowercase Letter");
                break;
            case 5:
                System.out.println("The password should contain atleast one Special Character");
                break;
            case 6:
                System.out.println("Successfully Signed Up");
                break; 
            case 7:
                System.out.println("The password Should not contain a Space");
                break;   
        }
    }
}