class BinaryToDeci
{
 public static void main(String args[])
{
 int temp=1;
 int num=10110;
 int out=0;
 int i=0;
 while(num!=0)
{
 temp=num%10;
 out+=temp*Math.pow(2,i);
 num=num/10;
 i++;
}
System.out.println(out);
}
}