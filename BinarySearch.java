import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to be searched : ");
        int key=sc.nextInt();
        int f=0,l=n;
        while(f<=l)
        {
            int mid=(f+l)/2;
            if(a[mid]==key)
            {
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(a[mid]<key)
            {
                f=mid+1;
            }
            else{
                l=mid-1;
            }
            if(f>l)
            {
                System.out.println("Element not Found ");
            }
            
        }
    }
}