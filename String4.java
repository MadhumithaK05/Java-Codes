import java.util.*;
class String4{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.append(" World"));
        System.out.println(sb.substring(5));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
    }
}
