package lab1.question2;

public class Point {
    private int x;
    private int y;
    public Point(){
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public double Distance(Point pointB){
        double x2 = pointB.getX();
        double y2 = pointB.getY();
        double x1 = this.x;
        double y1 = this.y;
        double a = Math.pow((x1 - x2),2);
        double b = Math.pow((y1 - y2),2);
        double c = a + b;
        double result = Math.sqrt(c);
        System.out.println("Result is:" + result);
        return result;
    }
}
