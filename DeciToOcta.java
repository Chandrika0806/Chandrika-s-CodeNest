class DeciToOcta
{
 public static void main(String args[])
{
 int num=456;
 int i=0;
 int octa[]=new int[50];
 while (num!=0)
{
 octa[i]=num%8;
 num=num/8;
 i++;
}
for(int j=i-1;j>=0;j--)
{
 System.out.print(octa[j]);
}
}
}