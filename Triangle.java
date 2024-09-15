import java.util.Scanner;
class Triangle
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size");
   int num=sc.nextInt();
   for(int row=1;row<=num;row++)
   {
     for(int col=1;col<=row;col++)
	 {
	   System.out.print(" # ");
	 }
	  System.out.println();
   }
//first
    System.out.print("\n\n");
   for(int row=num;row>=1;row--)
   {
     for(int col=1;col<=row;col++)
	 {
	   System.out.print(" # ");
	 }
	  System.out.println();
   }
   System.out.print("\n\n");
//second
  }
 }
