package Recursion;

public class Armstrong {
    public static void main(String[] args){
        int sum=0;
        int num=153;
        int num1= num;
        num(num,sum,num1);

    }
    static void num(int num,int sum,int num1){
        
        if(num==0){
            if(sum == num1){
                System.out.println("Yes");
                return;
            }
            else{
                System.out.println("No");
                return;
            }
        }
        int index= num%10;
        sum=sum+ index*index*index;
        System.out.println(sum);
        num(num/10,sum,num1);

    }

}
