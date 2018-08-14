import java.util.Scanner;
public class Ma {
public static void main(String args[]) {
int a,b,i;
int c=0;
Scanner obj= new Scanner(System.in);
System.out.println("enter 1st no");
a=obj.nextInt();
System.out.println("enter 2st no");
b=obj.nextInt();
for(i=1;i<=b;i++)
{
c+=a;
}
System.out.println("multi"+c);
}
}


