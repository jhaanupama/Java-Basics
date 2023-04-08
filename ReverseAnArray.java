public class ReverseAnArray {
    public static void main(String[] args) {
        
    
    
        int[] array= {1,2,3,4,5};
        System.out.println("After Reversing");
        Reverse(array);
    
    }
    
    static void Reverse(int[] array){
        int n= array.length;
        int[] ReverseArray= new int[n];
       
    for (int i=0;i<n;i++){
      
     ReverseArray[i]= array[n-i-1];
    }
    System.out.println("Reversed array is: \n");
    for (int k = 0; k < n; k++) {
        System.out.println(ReverseArray[k]);
    }
    }
    
    }
