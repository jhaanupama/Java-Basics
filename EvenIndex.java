import java.util.Arrays;
import java.util.*;
public class EvenIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int n= input.nextInt();
        String[] array= new String[n];
        for(int i=0;i<array.length;i++){
       
        System.out.println("take String input");
        String a= input.next();
        array[i]= a;
        }
        System.out.println(Arrays.toString(array));
        EvenIndex(array);
        System.out.println(Arrays.toString(array));
    }
    static void EvenIndex(String[] array){
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                array[i]="hello";
            }
        }
    }
}
