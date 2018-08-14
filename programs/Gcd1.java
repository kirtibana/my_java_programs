import java.util.Scanner;
class Gcd1
    {
        public static void main(String args[])throws Exception
        {
//Scanner is a class.
            Scanner sc = new Scanner(System.in); //input  take in text scan through command line.
            System.out.print("Enter the First no : ");
            int n1=sc.nextInt(); //convert string to int.
            System.out.print("Enter the Second no : ");
            int n2=sc.nextInt();
          System.out.print("Enter the third no : "); 
            int n3=sc.nextInt();

             
            while(n1 != n2)
            {
                if(n1 > n2)
                    n1 = n1-n2;
                else
                    n2 = n2-n1;
            }
            System.out.print("GCD = "+n1);
        }
    }