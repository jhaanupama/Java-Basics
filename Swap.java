import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number a");
        int num1= input.nextInt();
        System.out.println("Enter number b");
        int num2=input.nextInt();

        swap(num1,num2);

    }
    static void swap(int a,int b){
        int num;
        num =a;
        a= b;
        b=num;
        System.out.println("After Swapping a");
        System.out.println(a);
        System.out.println("After Swapping b");
        System.out.println(b);


    }
}
