import java.util.Scanner;
class Switch
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   char op=sc.next().charAt(0);
   int a=sc.nextInt();
   int b=sc.nextInt();
   switch(op)
   {
    case '+':
    System.out.println(a+b);
    break;
    case '-':
    System.out.println(a-b);
    break;
    case '*':
    System.out.println(a*b);
    break;
    case '/':
    System.out.println(a/b);
    break;
    case '%':
    System.out.println(a%b);
    break;
    default:
      System.out.println("Invakid operator entered");
   }
  }
 }