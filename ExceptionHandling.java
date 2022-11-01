import java.util.*;
class ExceedingPercentException extends Exception
{
    int per;
    ExceedingPercentException(int a)
    {
        per=a;
    }
    public String toString()
    {
        return "Please Enter Percentage Between 0 to 100 .";
    }
}
class ThrowsException{
    public void Check(int n) throws ExceedingPercentException{
        if(n<0 || n>100){
            throw new ExceedingPercentException(n);
        }
        else 
        {
            System.out.println("You Secured "+n+" %");
        }
    }
}
class ExceptionHandling {
    public static void main(String[] args) 
    {
        ThrowsException u=new ThrowsException();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Percentage : ");
        int p=sc.nextInt();
        try{
            u.Check(p);
        }
        catch(ExceedingPercentException n)
        {
            System.out.println(n.toString());
        }
    }
}