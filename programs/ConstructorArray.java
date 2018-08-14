import java.util.Scanner;
class ConstructorArray
{
int a;
int array[][];
ConstructorArray(int a)
{
this.a=a;
array=new int[a][a];
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
array[i][j]=(int)(Math.random()*10);
System.out.print(array[i][j]+" ");
}
System.out.println();
}
}
void addc(ConstructorArray x)
{
if(this.a==x.a)
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
System.out.print(this.array[i][j]+x.array[i][j]+" ");
}
System.out.println();
}
else
{
System.out.println("incompatible size");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of arrays:");
int size=sc.nextInt();
ConstructorArray c[]= new ConstructorArray[size];
for(int i=0;i<size;i++)
{
System.out.println("enter the size of array which you want to pass the constructor");
int a=sc.nextInt();
c[i]=new ConstructorArray(a);
}
c[0].addc(c[1]);
}
}

  



