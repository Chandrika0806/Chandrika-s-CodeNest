import java.util.*;
public class CountVD
 {
  public static void main(String args[]);
  Scanner in=new Scanner(System.in);
  System.out.println("Enter a string: ");
  String input=in.nextLine();
  int vCount=0;
  int dCount=0;
  String vowels ="aeiouAEIOU";
  for(int i=0;i<=input.length();i++)
   {
    char c=input.charAt(i);
	if(vowels.indexof(c)!=-1)
	 {
	  vCount++;
	 }
	 if(Character.isDigit(C))
		 {
	       dCount++;
	     }
	 }
	 int totalCharacters=input.length();
	 double vowelpercentage=(double) vCount/totalCharacters*100;
	 double digitPercentage=(double) dCount/totalCharacters*100;
	 System.out.print("Number of vowels: %v (%.2f%%)\n", vCount, vowelpercentage);
	 System.out.print("Number of digits: %d (%.2f%%)\n", dCount, Digitpercentage);
	 in.close();
	 }
}