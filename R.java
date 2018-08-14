class Rectangle
{
int l,w;
void getdata(int x , int y)
{
l=x;
w=y;
}
int RecA()
{
int ar=l*w;
return (ar);
}
}
class R
{
public static void main(String[] args)
{
Rectangle a=new Rectangle();
a.l=15;
a.w=10;
int Area=a.RecA();
System.out.println("Area="+Area);
}
}
