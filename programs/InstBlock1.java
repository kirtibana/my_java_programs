class InstBlock1
{
int a;
{
System.out.println("block1");
a=10;
}

InstBlock1()
{
System.out.println("it is const 1");
}
InstBlock1(int x)
{
a=x;
System.out.println("it is const 2");
}
{
System.out.println("block2");

}
InstBlock1(double y)
{
double c;
c=y;
System.out.println("it is const 3");
System.out.println("c is"+c);

}
{
System.out.println("block3");

}

public static void main(String args[])
{
InstBlock1 b1= new InstBlock1();
InstBlock1 b2=new InstBlock1(20);
InstBlock1 b3=new InstBlock1(11.5);


System.out.println("a is"+b1.a);
System.out.println("a is"+b2.a);

}
}