public class Main {
    public static void main(String[] args) {
        //Shape:
        Shape s1 = new Shape("blue", true);

        //Circle:
        Circle s2 = new Circle(2.0,"yellow", false);

        //Rectangle:
        Rectangle s3 = new Rectangle(2,4,"red", true);

        //Square:
        Square s4 = new Square(3,"pink", false);

        System.out.println(s1.toString());

        System.out.println(s2.toString());
        System.out.println("the Area:");
        System.out.println(s2.getArea());
        System.out.println("the Perimeter:");
        System.out.println(s2.getPerimeter());

        System.out.println(s3.toString());
        System.out.println("the Area:");
        System.out.println(s3.getArea());
        System.out.println("the Perimeter:");
        System.out.println(s3.getPerimeter());

        System.out.println(s4.toString());
        System.out.println("the Area:");
        System.out.println(s4.getArea());
        System.out.println("the Perimeter:");
        System.out.println(s4.getPerimeter());


    }
}