import java.util.*;
public class Armstrong{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number= ");
int num=scan.nextInt();
int SumOfPowerOfDigits=0,dig,count=0;
for(int i=num;i>0;i/=10)
{
	count+=1;
}
for(int i=num;i>0;i/=10)
{
	dig=i%10;
	SumOfPowerOfDigits+=Math.pow(dig,count);
}
if(SumOfPowerOfDigits==num)
{
	System.out.print(num+ "is an Armstrong number");
}
else
{
	System.out.println(num+"is not an Armstrongnumber");
}
}
}