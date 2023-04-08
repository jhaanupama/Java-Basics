import java.util.LinkedList;
import java.util.Scanner;
public class AddressDirectory {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String option;
        option=input.nextLine();
        LinkedList<String> list= new LinkedList<>();
        while(option!="exit"){
        System.out.println("Choose the operation");
        System.out.println("Add ");
        System.out.println("Update");
        System.out.println("Delete");
        System.out.println("Print");
        System.out.println("exit ");

        
        option=input.nextLine();

        switch (option) {
            case "Add":
            System.out.println("add the address");
            String NewAddress= input.nextLine();
            list.add(NewAddress);
               
                break;
            case "Update":
            System.out.println("Update the address");
            System.out.println("give the index of the address");
            int index=input.nextInt();
            System.out.println("give the new address");
            String UpdatedAddress= input.nextLine();
            list.set( index, UpdatedAddress);

            case "Delete":
            System.out.println("Delete the address");
            System.out.println("give the index of the address");
            int index2=input.nextInt();
            list.remove(index2);

            case "Print":
            System.out.println("here is the address");
            System.out.println(list);

        
            default:
                break;
        }
    }

    }

}
