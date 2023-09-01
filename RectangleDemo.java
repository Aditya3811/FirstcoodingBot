//java program to difference two integers
//01-09-2023
//RectangleDemo
//Aditya
import java.io.*;
class RectangleCalc
{
int l = 5;
int b = 10;
int areaRectangle()
{
int a = l*b;
return a;
}
int perimeter ()
{
int p = 2*(l+b);
return p;
}
}
class RectangleDemo
{
public static void main(String args[])
{
RectangleCalc rc = new RectangleCalc();
int area = rc.areaRectangle();
int perimeter = rc.perimeter();
System.out.println("area of rectangle is " + area);
System.out.println("perimeter of rectangle is " + perimeter);
}
}
