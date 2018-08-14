package ABCD;

class Student
{ 
public static void main(String args[])
{
Student s1=new Student();
System.out.println( s1.toString() );
}

@Override
public String toString()
{
	return "This is an instance of Student";
}

}