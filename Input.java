
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name:");
        String name=sc.nextLine();
        System.out.print("enter your age");
        int age=sc.nextInt();
      System.out.print("what's your percentage in 12th");
      double percentage=sc.nextDouble();
      System.out.print("Are you a student?(true/false):");
      boolean isStudent=sc.nextBoolean();
System.out.println("Namaskar"+name);
 System.out.println("you are"+age+"years old"); 
 System.out.println("your percentage is:"+percentage);  
 if(isStudent){
   System.out.println("you are enrolled as a student");
 }
else{
  System.out.println("you are not a student");
}
        sc.close();
      
    }
}
