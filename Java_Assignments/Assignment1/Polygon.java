import java.io.*;

abstract class Polygonshape
{
	public void sumOfAngles(int x)
	{
		int sum=180*(x-2);
		System.out.println("sum of angles="+sum);
	}
	abstract void calculatePerimeter();
}
public class Polygon
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of dimensions:");
		int dimension=Integer.parseInt(br.readLine());
                double side[];
                switch(dimension)
                {
                    case 1:
                    case 2:System.out.println("enter value greater than 2");
                           break;
                    case 3:System.out.println("enter sides of triangle:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Triangle t=new Triangle(side);
                            t.calculatePerimeter();
                            t.sumOfAngles(dimension);
                            break;
                    case 4:System.out.println("enter sides:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            boolean flag=true;
                            for(int i=0;i<dimension;i++)
                            {
                                if(side[i]==side[i+1]&&side[i]==side[i+2])
                                {
                                    System.out.println("its square.. ");
                                    flag=true;
                                    break;
                                }
                                 if(side[i]==side[i+2]&&side[i+1]==side[i+3])
                                {
                                    System.out.println("its rectangle..");
                                    flag=false;
                                    break;
                                }
                            }
                            if(flag==true)
                            {
                                Square s=new Square(side);
                                s.calculatePerimeter();
                                s.sumOfAngles(dimension);
                            }
                            else
                            {
                                Rectangle r=new Rectangle(side);
                                r.calculatePerimeter();
                                r.sumOfAngles(dimension);
                            }
                            break;
                    case 5 :System.out.println("enter sides of pentagon:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Pentagon p=new Pentagon(side);
                            p.calculatePerimeter();
                            p.sumOfAngles(dimension);
                            break;
                    case 6: System.out.println("enter sides of hexagon:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Hexagon h=new Hexagon(side);
                            h.calculatePerimeter();
                            h.sumOfAngles(dimension);
                            break;
                    case 7: System.out.println("enter sides of hexagon:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Heptagon hp=new Heptagon(side);
                            hp.calculatePerimeter();
                            hp.sumOfAngles(dimension);
                            break;
                    case 8:System.out.println("enter sides of octagram:");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Octagram o=new Octagram(side);
                            o.calculatePerimeter();
                            o.sumOfAngles(dimension);
                            break;
                    case 9:System.out.println("enter sides :");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Ninesidedshape n=new Ninesidedshape(side);
                            n.calculatePerimeter();
                            n.sumOfAngles(dimension);
                            break;
                    case 10:System.out.println("enter sides :");
                             side=new double[dimension];
                            for(int i=0;i<dimension;i++)
                            {
                                side[i]=Double.parseDouble(br.readLine());
                            }
                            Tensidedshape ts=new Tensidedshape(side);
                            ts.calculatePerimeter();
                            ts.sumOfAngles(dimension);
                            break;
                }
         }
}
 class Triangle extends Polygonshape
{
	private double side1,side2,side3;
	Triangle(double side[])
	{
		side1=side[0];
		side2=side[1];
		side3=side[2];
	}
	public void calculatePerimeter()
	{
		
		System.out.println("perimeter:"+(side1+side2+side3));
	}
}
 class Square extends Polygonshape
 {
      private double sideSquare;
     Square(double side[])
     {
         sideSquare=side[0];
         
         
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of square="+(sideSquare*4));
     }
 }
 class Rectangle extends Polygonshape
 {
      private double height,width;
     Rectangle(double side[])
     {
         height=side[0];
         width=side[1];
         
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of rectangle="+(2*(height+width)));
     }
 }
 class Pentagon extends Polygonshape
 {
      private double side1,side2,side3,side4,side5;
     Pentagon(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of pentagon="+(side1+side2+side3+side4+side5));
     }
 }
 class Hexagon extends Polygonshape
 {
      private double side1,side2,side3,side4,side5,side6;
     Hexagon(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         side6=side[5];
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of hexagon="+(side1+side2+side3+side4+side5+side6));
     }
 }
 class Heptagon extends Polygonshape
 {
      private double side1,side2,side3,side4,side5,side6,side7;
     Heptagon(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         side6=side[5];
         side7=side[6];
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of heptagon="+(side1+side2+side3+side4+side5+side6+side7));
     }
 }
 class Octagram extends Polygonshape
 {
      private double side1,side2,side3,side4,side5,side6,side7,side8;
     Octagram(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         side6=side[5];
         side7=side[6];
         side8=side[7];
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of octagram="+(side1+side2+side3+side4+side5+side6+side7+side8));
     }
 }
 class Ninesidedshape extends Polygonshape
 {
      private double side1,side2,side3,side4,side5,side6,side7,side8,side9;
     Ninesidedshape(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         side6=side[5];
         side7=side[6];
         side8=side[7];
         side9=side[8];
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of ninesidedshape="+(side1+side2+side3+side4+side5+side6+side7+side8+side9));
     }
 }
 class Tensidedshape extends Polygonshape
 {
      private double side1,side2,side3,side4,side5,side6,side7,side8,side9,side10;
     Tensidedshape(double side[])
     {
         side1=side[0];
         side2=side[1];
         side3=side[2];
         side4=side[3];
         side5=side[4];
         side6=side[5];
         side7=side[6];
         side8=side[7];
         side9=side[8];
         side10=side[9];
     }
     @Override
     public void calculatePerimeter()
     {
         
         System.out.println("perimeter of Tensidedshape="+(side1+side2+side3+side4+side5+side6+side7+side8+side9+side10));
     }
 }
