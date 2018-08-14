class Room
{
float length;
float breadth;
/*void getdata(float a,float b)
{
length=a;
breadth=b;
} */
}
class RoomArea
{
public static void main(String args[])
{
float area;
Room room1 = new Room();
//room1.getdata(14,10);
room1.length=14;
room1.breadth=10;
area = room1.length * room1.breadth;
System.out.println("Area"+area);
Room room2 = new Room();
room2.length=10;
room2.breadth=20;
area = room2.length * room2.breadth;
System.out.println("Area"+area);

}
}