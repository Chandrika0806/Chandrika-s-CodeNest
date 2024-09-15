import java.util.Scanner;
class Leapyear
{
 public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   int yr=sc.nextInt();
   if(yr%4==0)
 {
   if(yr%100==0)
 { 
   if(yr%400==0)
 {
  System.out.println("Leapyear");
 }
  else
 {
  System.out.println("Not a leapyear");
 }
} 
 else 
{ 
 System.out.println("Leapyear");
 }
}
 else
{
 System.out.println("Not a leapyear");
  }
 }
} 