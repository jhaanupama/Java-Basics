import java.util.Scanner;


class Calculator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
       
        char operator;
        double num1,num2,result;
         //Asking what operation needs to be done 
         System.out.println("Choose an operator : +,-,*,/");
         operator= input.next().charAt(0);

         // taking inputs of the two numbers
         System.out.println("Enter number 1");
         num1=input.nextDouble() ;
         System.out.println("Enter number 2");
         num2=input.nextDouble();

    switch (operator) {
        case '+':

        result = num1+ num2;
        System.out.println("the sum of two numbers is " + result);
            break;
            case '-':

        result = num1- num2;
        System.out.println("the substraction of two numbers is " + result);
            break;
        case '*':
        result = num1*num2;
        System.out.println("the substraction of two numbers is " + result);
            break;
        case '/':
         result = num1/ num2;
        System.out.println("the divisiion of two numbers is " + result);
            break;
    
        default:
        System.out.println("Not valid");
            break;
    }

    } }
