class String1{
    public static void main(String[] args){	
        String a="Hello";
        String b="World";
        System.out.println("a equals b ? "+a.equals(b));
        System.out.println("a compares b ? "+a.compareTo(b));
        System.out.println("lenght of a and b ? "+a.length()+" and "+b.length());
        StringBuffer sb=new StringBuffer("Welcome");
        System.out.println("Capacity ? "+sb.capacity());
    
    }
    }
    