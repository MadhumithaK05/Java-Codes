class FinallyBlock {
    public static void main(String[] args) 
    {
        try{
            int a[]={1,2,3,4,5};
            int b=a[5];
        }
        catch(ArrayIndexOutOfBoundsException n){
            System.out.println("Sorry Array index out of bound Exception Occured");
        }
        finally{
            System.out.print("Finally block will be executed anyways.");
        }
    }
}