public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }



    public String toString() {
        return "A " + getColor() + " Square with a side = " + getLength() + "which is a subclass of Shape " + super.toString();
    }



}
