package Recursion;

public class Armstrong {
    public static void main(String[] args) {

        int sum = 0;
        Sum(123, sum);
        System.out.println(sum);
    }

    static void Sum(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);  

            return;

        }
        int index = num % 10;

        //System.out.println(index);
        sum = sum + index * index * index;
        //System.out.println(num);
       
        Sum(num / 10, sum);
       // System.out.println(sum);

    }

}
