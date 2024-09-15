class Highestvalue
{ 
 public static void main (String rags[])
  { int a=400,b=600,c=1000,d=1400,result;
    result = (a>b)?(a>c)?(a>d?a:c):(b>c?b:c):(c>d?c:d);
    System.out.println(result);
  }
}
 