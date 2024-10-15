public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double xsub = b.getX() - a.getX();
    double ysub = b.getY() - a.getY();
    return Math.sqrt((xsub * xsub) + (ysub * ysub));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    System.out.println("this is point 3: " +  p3);
    System.out.println("this is point 4: " + p4);
    Point triangle1 = new Point(0,0);
    Point triangle2 = new Point(1,0);
    Point triangle3 = new Point(1/2,Math.sqrt(3) / 2);


    System.out.println( distance(p1,p2));
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p2));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p2));
    System.out.println( p1.distanceTo(p3));

  }
}
