import java.util.scanner;
public class Area{
  public static void main (String[]args){
    //calculate area of a rectangle 
    double width=0;
    double height=0;
    double area=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the width:");
    width=sc.nextdouble();
    System.out.print("enter the height:");
    height=sc.nextdouble();
    area=width*height;
    System.out.println("the area is :"+area);
    sc.close();
  }
}
