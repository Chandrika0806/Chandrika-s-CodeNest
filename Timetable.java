import java.util.Scanner;
class Timetable
{
  public static void main(String[]args)
 {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size of table");
  num=sc.nextInt();
  System.out.print(" * | ");
  for(int row=1;row<=num;row++)
  {
   System.out.printf("%4d",row);
  }
   System.out.println();
   for(int row=0;row<=num;row++)
   {
    System.out.print("----");
   }
   System.out.println();
   for(int row=1;row<=num;row++)
   {
     System.out.printf("%4d",row);
	 System.out.print("|");
	  for(int col=1;col<=num;col++)
	  {
	    System.out.printf("%4d",row*col);
	  }
	  System.out.println();
	 }
	  
	 }
	}