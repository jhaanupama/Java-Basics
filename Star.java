import java.util.*;
public class Star {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        for (int i=1;i<n+1;i++){
            System.out.println("");
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        }
    }
}
