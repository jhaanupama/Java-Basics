import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferReader {
    public static void main(String[] args) 
         throws IOException
    {
    FileReader fr= new FileReader("text.txt");
    BufferedReader br= new BufferedReader(fr);
     // use of the mark() method
     br.mark(100);
     //use of the readine() method
     if(br.ready()){
     System.out.println(br.readLine());
    }
    //br.skip(5);
    br.mark(100);
    System.out.println(br.readLine());
    br.reset();
    //System.out.println(br.readLine());
}}
