package code.bootcamp.example;

public class Circle {

    private double radius;

    public Circle(Point center, double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public double circumference(){
        return 2 * Math.PI * this.radius ;
    }

    public boolean intersects(Circle circle){
        return circle.radius >= this.radius + circle.radius;
    }


    public static void main(String[] args) {
        var p1 = new Point(0.0, 0.0);
        var p2 = new Point(4.0, 4.0);
        var c1 = new Circle(p1, 1);
        var c2 = new Circle(p2, 1);
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(c1.intersects(c2));


    }




}
