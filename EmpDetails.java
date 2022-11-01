
import java.util.Scanner;
class Employee{
    int tot,avg;
    void setId(int id)
    {
        System.out.println("Employee Id : "+id);
    }
    void setName(String sname)
    {
        System.out.println("Employee Name : "+sname);
    } 
    void setAge(int sage)
    {
        System.out.println("Employee Age : "+sage);
    } 
    void setDept(String dept)
    {
        System.out.println("Employee Role : "+dept);
    } 
    void getSalary(int salary)
    {
        System.out.println("Employee Name : "+salary);
    }
}
class EmpDetails{
    public static void main(String[] args)
    {
        Employee ob=new Employee();
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int no=sc.nextInt();
        System.out.println("Enter Employee Name : ");
        String name=sc2.nextLine();
        System.out.println("Enter Employee Age : ");
        int age=sc.nextInt();
        System.out.println("Enter Employee Role : ");
        String role=sc2.nextLine();
        System.out.println("Enter Employee Salary : ");
        int sal=sc2.nextInt();
        ob.setId(no);
        ob.setName(name);
        ob.setAge(age);
        ob.setDept(role);
        ob.getSalary(sal);
    
    }
}
    