class ArithmeticExcept {
    public static void main(String[] args) {
        try{
            int a=25;
            int b=0;
            int res=a/b;
        }
        catch(ArithmeticException n)
        {
            System.out.println("Sorry Arithmetic Exception !!");
            System.out.println("Denominator should not be zero.");
        }
    }
}
