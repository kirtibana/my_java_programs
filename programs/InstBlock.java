class InstBlock
{
int a;
{
System.out.println("block");
a=10;
}

InstBlock()
{
System.out.println("it is const 1");
}


public static void main(String args[])
{
InstBlock b1= new InstBlock();

System.out.println("a is"+b1.a);

}
}  