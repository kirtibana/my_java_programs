public class Gcd
{
public static void main(String args[])
{
int n1= 81, n2= 153, gcd=1;
for(i=1;i<=n1 && i<=n2;++i)
{
if(n1%i==0 && n2%i==0)
gcd=i;
}
System.out.println("gcd of %d of %d is %d"+n1+n2+gcd);
}
}