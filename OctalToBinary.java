class OctalToBinary
{
static String converter(String octalvalue)
{
int i=0;
String binary="   ";
while(i<octalvalue.length())
{
char c=octalvalue.charAt((int)i);
switch(c){
case '0':
binary+="000";
break;
case '1':
binary+="001";
break;
case '2':
binary+="010";
break;
case '3':
binary+="011";
break;
case '4':
binary+="100";
break;
case '5':
binary+="101";
break;
case '6':
binary+="110";
break;
case '7':
binary+="111";
break;
default:
System.out.println("out of value");
break;
}
i++;
}
return binary;
}
public static void main(String args[])
{
String octalNumber="675";
String result=converter(octalNumber);
System.out.println("octalNumber to binary:"+result);
}
}
