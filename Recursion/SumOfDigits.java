package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;
        Sum(123, sum);
       
    }

    static void Sum(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);  

            return;

        }
        int index = num % 10;

        //System.out.println(index);
        sum = sum + index ;
        //System.out.println(num);
       
        Sum(num / 10, sum);
       // System.out.println(sum);

    }

}
