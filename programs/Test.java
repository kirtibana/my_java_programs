class Test
{
    // static variable
static int b;
 static int a;

     
    // static block
    static 
{
        System.out.println("Inside static block");
       b=10;
m1();
    }
     
    // static method
    static void m1() 
{
        System.out.println("from m1");
        a=20;
    }
     
    // static method(main !!)
    public static void main(String[] args)
    {
System.out.println("from main");
      System.out.println("value of b"+b);
       System.out.println("value of a"+a);
       System.out.println("from main");
    }   
 
 
}