package Recursion;

public class Palindrone {
    public static void main(String[] args) {
        int reverse=0;
       int rev= reverse(121,reverse);
       System.out.println(rev);

    }

static int reverse(int num,int reverse){
    if(num==0){
        return reverse;
    }
    int r= num%10;
     reverse = reverse*10 + r;
      return reverse(num/10,reverse);
    
}
}