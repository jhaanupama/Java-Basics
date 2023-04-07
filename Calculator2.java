import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        char operator;
        double num1,num2,result;
        System.out.println("Choose an operator : +,-,*,/");
        operator= input.next().charAt(0);

        // taking inputs of the two numbers
        System.out.println("Enter number 1");
        num1=input.nextDouble() ;
        System.out.println("Enter number 2");
        num2=input.nextDouble();

        if(operator=='+'){
            result = num1+ num2;
            System.out.println("the sum of two numbers is " + result);
        }
        else if(operator=='-'){
            result = num1- num2;
        System.out.println("the substraction of two numbers is " + result); 
            
        }
        else if(operator=='*'){
            result = num1* num2;
        System.out.println("the multiplicationof two numbers is " + result); 
            
        }
        else if(operator == '/'){
            result = num1/ num2;
        System.out.println("the division of two numbers is " + result); 
        }


    }
    
}
