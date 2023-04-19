package Recursion;

public class ReverseString {
    public static void main(String[] args)  {
        String str="hello";
        int n= str.length();
        char[] arr = new char[str.length()];
        for(int i=0; i<n;i++){
            arr[i]=str.charAt(i);
        }
        char[] Reverse = new char[str.length()];
        Reverse(arr,0,Reverse);
        System.out.println(Reverse);
    }
    static void Reverse(char[] word,int i,char[] reverse ){
        int l = word.length;
         
         if( i==(l)){
            return;
         }
        reverse[i]= word[l-i-1];
        Reverse(word,i+1,reverse);

    }
}
