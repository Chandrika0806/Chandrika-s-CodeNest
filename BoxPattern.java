import java.util.Scanner;
class Boxpattern{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size");
  int num=sc.nextInt();
  for(int row=1;row<=num;row++)
  {
   for(int col=1;col<=num;col++)
    if(row==1||row==num||col==1||col==num)
	{
	  System.out.print(" * ");
     }
	  else
	  {
	   System.out.print("   ");
	   }
	   System.out.println();
	 }
	 System.out.println("\n\n");
	 for(int row=1;row<=num;row++)
  {
   for(int col=1;col<=num;col++)
    if(row==1||row==num||row==col)
	{
	  System.out.print(" * ");
     }
	  else
	  {
	   System.out.print("   ");
	   }
	   System.out.println();
	 }
	  System.out.println("\n\n");
	 for(int row=num;row>=1;row--)
  {
   for(int col=1;col<=num;col++)
    if(row==1||row==num||row==col)
	{
	  System.out.print(" * ");
     }
	  else
	  {
	   System.out.print("   ");
	   }
	   System.out.println();
	 }
	  System.out.println("\n\n");
	 for(int row=1;row<=num;row++)
  {
   for(int col=1;col<=num;col++)
    if(row==1||row==num||row==col||col==(num-row+1))
	{
	  System.out.print(" * ");
     }
	  else
	  {
	   System.out.print("   ");
	   }
	   System.out.println();
	 }
      System.out.println("\n\n");
	 for(int row=1;row<=num;row++)
  {
   for(int col=1;col<=num;col++)
    if(row==1||row==num||row==col||col==(num-row+1)||col==1||col==num)
	{
	  System.out.print(" * ");
     }
	  else
	  {
	   System.out.print("   ");
	   }
	   System.out.println();
	 }  
     }
 }