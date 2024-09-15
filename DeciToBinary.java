class DeciToBinary
{
 public static void main(String rags[])
{
 int num=108;
 int i=0;
 int binary[]=new int[50];
 while (num!=0)
{
 binary[i]=num%2;
 num=num/2;
 i++;
}
for(int j=i-1;j>=0;j--)
{
 System.out.print(binary[j]);
}
}
} 