import java.io.*;
class StringEnd{
public static void main(String[] args) throws  IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text(to end enter end) : ");
        String s;
        do {
                s=br.readLine();
                System.out.println(s);
        }while(!s.equals("end"));
        System.out.println("End of File");
}
}
