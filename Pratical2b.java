import java.util.Scanner;
//Square of numbers using CMD(Command line Argument)
public class SquareUsingCmd{
  public static void main(String[ ]args)
  {
    if(args.length>0){
      int number=Integer.parseInt(args[0]);
      int square =number*number;
      System.out.println("square of"+number+"is:"+square);
    }
    else{
      System.out.println("No number provided, please pass a number arguments");
    }
  }    
}
