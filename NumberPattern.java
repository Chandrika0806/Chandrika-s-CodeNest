import java.util.*;
public class NumberPattern {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter the number: ");
for(int row=1;row<=n;row++)
{
for(int col=1;col<=row;col++)
{
System.out.print(col);
}
System.out.println();
}
System.out.print("\n\n");
   for(int row=n;row>=1;row--)
   {
     for(int col=1;col<=row;col++)
	 {
	   System.out.print(col);
	 }
	  System.out.println();
   }
  }
}