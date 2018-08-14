class TestCast
{
public static void main(String args[])
{
byte b=50;
b=(byte)(b*2);//it is correct using an explicit cast
//b=b*2;
//error, cannot assign an int to a byte.
System.out.println(b);
}
}
