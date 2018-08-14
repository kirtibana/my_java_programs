class ArrIntersection 
{
public static void main(String args[])
{
int a[]={2,5,7,8,9,10,2,5,7,8,9,10};
int b[]={2,3,7,11,12,5,2,3,7,11,12,5};
int c[]={7,5,6,2,8,12,5,7,5,6,2,8,12,5};
int max=a.length;
if(b.length>max)
max=b.length;
if(c.length>max)
max=c.length;
int intersection[]=new int[max];
int count=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
for(int k=0;k<c.length;k++)
{
if(c[k]==b[j])
{
boolean found=false;
for(int z=0;z<count;z++)
{
if(intersection[z]==c[k])
{
found=true;
break;
}
}
if(!found)
{
intersection[count++]=c[k];
}
break;
}
}
}
}
}
for(int i=0;i<count;i++)
{
System.out.println(intersection[i]);
}
}
}

