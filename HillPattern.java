import java.util.*;
public class HillPattern
  {
    public static void main(String args[])
    {
     int size;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the size of the table: ");
     size=in.nextInt();
     for(int row=1;row<=size;row++)
      {
        for(int col=1;col<=size-row;col++)
         {
           System.out.print("   ");
         }
        for(int col=1;col<=2*row-1;col++)
         { 
          System.out.print(" * ");
         }
          System.out.println();
       }
    }
}