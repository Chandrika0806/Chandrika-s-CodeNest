class HexaToDeci
{
public static void main(String args[])
{
int temp=0;
 int num=45;
 int out=0;
 int i=0;
 while(num!=0)
{
 temp=num%10;
 out+=temp*Math.pow(16,i);
 num=num/10;
 i++;
}
System.out.println(out);
}
}