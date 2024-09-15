import java.util.Scanner;
class SquarePattern
{
  public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size of table");
  int n=sc.nextInt();
  for(int row=1;row<=n;row++)
  {
  for(int col=1;col<=n;col++)
  {
    System.out.print("*");
  }
   System.out.println();
  }
}
}