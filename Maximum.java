import java.util.Scanner;
class Maximum
{
 public static void main(String rags[])
{
 Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 int r=x>y?x:y;
 System.out.println("Max of x and y=" +r);
}
}