class String1
{
public static void main(String args[])
{
int[] a=new int[10];
System.out.println(a.length);//it is different length().
//length only use for array.
String s="welcome";
System.out.println(s.toUpperCase());
String s1="UPPER";
System.out.println(s1.toLowerCase());
System.out.println(s.concat(s1));
System.out.println(s.substring(2,3));
System.out.println(s1.length());//length() is for string only.

}
}
