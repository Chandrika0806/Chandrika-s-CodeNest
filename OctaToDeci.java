class OctaToDeci
{
public static void main(String args[])
{
 int temp=0;
 int num=765;
 int out=0;
 int i=0;
 while(num!=0)
{
 temp=num%10;
 out+=temp*Math.pow(8,i);
 num=num/10;
 i++;
}
System.out.println(out);
}
}