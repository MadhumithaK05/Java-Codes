import java.util.Scanner;
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
class ThrowException {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Percentage : ");
        int p=sc.nextInt();
        try{
            if(p<0 || p>100){
                throw new ExceedingPercentException(p);
            }
            else 
            {
                System.out.println("You Secured "+p+" %");
            }
        }
        catch(ExceedingPercentException n)
        {
            System.out.println(n.toString());
        }
    }
}
