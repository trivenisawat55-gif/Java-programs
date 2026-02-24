import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        if(args.length>0){
        System.out.println("Welcome Mr/Mr"+args[0]+" "+args[1]);
        }
        else{
            System.out.println("No Name Provided");
        }
    }
}
