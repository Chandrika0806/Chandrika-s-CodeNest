	import java.util.Scanner;
public class Main{
    public static int addlastdigit(int n1,int n2){
        int l1=n1%10;
        int l2=n2%10;
        return l1+l2;
    }
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n1=sc.nextInt();
	  int n2=sc.nextInt();
	  int r=addlastdigit(Math.abs(n1),Math.abs(n2));
	  System.out.println(r);
	}
}
