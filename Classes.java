public class Classes {
    //instance variables
     String name;
     String Subject;
     int RoomNo;
     // methods
     void printName(){
        System.out.println(name);
     }
     //constructors
     Classes(String name,String Subject, int RoomNo){
        this.name=name;
        this.Subject=Subject;
        this.RoomNo=RoomNo;
        this.printName();
     }
    
 public static void main(String[] args) {
    // declararation of object
    Classes class1 =new Classes("firstClass","Maths",12);
    class1.printName();

    

 }
    

}
