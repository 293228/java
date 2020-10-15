package MyGraphic;
import java.util.*;
public class MyGraphic {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Scanner sc=new Scanner(System.in);
		rectangle.length1=sc.nextInt();
		rectangle.length2=sc.nextInt();
		System.out.println("矩形长为"+rectangle.length1+"    矩形宽为"+rectangle.length2);
		System.out.println("矩形面积s="+rectangle.length1*rectangle.length2);
		Triangle triangle=new Triangle();
		triangle.lengthOfSide1=sc.nextInt();
		triangle.lengthOfSide2=sc.nextInt();
		triangle.lengthOfSide3=sc.nextInt();
		System.out.println("三角形三边长分别为a="+triangle.lengthOfSide1+"   b="+triangle.lengthOfSide2+"   c="+triangle.lengthOfSide3);
		Circle circle=new Circle();
		circle.radius=sc.nextInt();
		System.out.println("圆的半径为r="+circle.radius);
		System.out.println("圆的面积为"+Math.PI *circle.radius);
		Ellipse ellipse=new Ellipse();
		ellipse.theLongAxis=sc.nextInt();
		ellipse.theShortAxis=sc.nextInt();
		System.out.println("椭圆长轴长为a="+ellipse.theLongAxis+"   短轴长为b="+ellipse.theShortAxis);
		System.out.println("椭圆面积为s="+Math.PI*ellipse.theLongAxis*ellipse.theShortAxis);
		Rhombus rhombus=new Rhombus();
		rhombus.diagonal1=sc.nextInt();
		rhombus.diagonal2=sc.nextInt();
		System.out.println("菱形对角线长度分别为a="+rhombus.diagonal1+"   b="+rhombus.diagonal2);
		System.out.println("菱形面积为s="+(rhombus.diagonal1*rhombus.diagonal2)/2.0);
		Trapezoid trapezoid=new Trapezoid();
		trapezoid.var1=sc.nextInt();
		trapezoid.var2=sc.nextInt();
		trapezoid.height=sc.nextInt();
		System.out.println("梯形上底面a="+trapezoid.var1+"   下底面b="+trapezoid.var2+"高h="+trapezoid.height);
		System.out.println("梯形面积s="+(trapezoid.height*(trapezoid.var1+trapezoid.var2))/2.0);
		
	}
}

class Rectangle {
	public int length1,length2,width;
	public int s;
}

class Triangle{
	public int lengthOfSide1,lengthOfSide2,lengthOfSide3;
}
class Circle{
	public int radius;
	public float s;
}
class Ellipse{
	public int theLongAxis;
	public int theShortAxis;
	public int s;
}
class  Rhombus{
	public int diagonal1,diagonal2;
	public int s;
}
class Trapezoid{
	public int var1,var2;
	public int height;
	public int s;
}
