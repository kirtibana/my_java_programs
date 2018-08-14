class UseStatic
{
static int a=3;
static int b;
static void meth(int x)
{
System.out.println("x="+x);
System.out.println("a="+a);
System.out.println("b="+b);
}
static 
{
System.out.println("static block initialized"); //1st excute this.
b=a*4;
}
public static void main(String args[]) //2 nd excute this.
{
meth(42);//called
}
}
