import java.util.*;
  public class ReverseString
   {
    public static void main(String args[])
	 {
	 String inStr;
	 int inStrLen;
	 Scanner in=new Scanner (System.in);
	 System.out.println("Enter a string: ");
	 inStr=in.next();
	 inStrLen=inStr.length();
	 System.out.print("The reverse of the string " + inStr +" is" + "  ");
	 for( int charIdx=inStrLen-1;charIdx>=0;charIdx--)
	 System.out.print(inStr.charAt(charIdx));
	 }
   }

