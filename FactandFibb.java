import java.util.Scanner;
public class FactandFibb {
     public static void main(String[]args){
        
        CalVal cv=new CalVal();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your choice 1-fact  ,2-fibb ,3-fact--Rec,4-fibb-Rec, 0-Exit");
        int choice =scanner.nextInt();
        while(choice!=0)
        { 
            if(choice==1)
           {
               System.out.print("Enter Any number to find factorial");
               int num1=scanner.nextInt();
              cv.fact(num1);
         }
          if(choice==2)
           {
               System.out.print("Enter total no of terms");
               int num1=scanner.nextInt();
              cv.fibb(num1);
}
        
	if(choice==3)
           {
               System.out.print("Enter Any number to find factorial");
               int num1=scanner.nextInt();
              int result=cv.factRec(num1);
               System.out.println("factorial is"+result);
         }
	if(choice==4)
           {
               System.out.print("Enter total no.of terms");
               int num1=scanner.nextInt();
              System.out.println("fib series is:");
              for(int i=0;i<=num1;i++)
		System.out.print(" " +cv.fibbRec(i));
	}
			System.out.print("do you want to continue(1-y/0-n)");
                         int ch=scanner.nextInt();
				if(ch==1)
				{
				System.out.print("Enter your choice 1-fact  ,2-fibb,3-fact-rec,4-fibb-Rec,0-Exit");
				choice=scanner.nextInt();
				}
				else
         		{ 
				break;
			}
            }
	}
}
class CalVal
{
     void fact(int  n)
		{
			int f=1;
			for(int i=n;i>1;i--)
			f=f*i;
			System.out.println("factorial is"+f);
	}
	void fibb(int n)
{
		int f=0,s=1,sum=0;
		System.out.print(f + " " + s + " ");
		for(int i=3;i<=n;i++)
		{
			sum=f+s;
			f=s;
			s=sum;
			System.out.print(sum + " ");
		}
}
		int factRec(int n)
		{
			if(n==1)
				return 1;
			else
					return n*factRec(n-1);
 			
			}
		int fibbRec(int n)
		{
			if(n==0 || n==1)
				return n;
			else 
					return fibbRec(n-1)+fibbRec(n-2);
		}
	  

}
