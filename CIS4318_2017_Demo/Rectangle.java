/**
 * Created by mjl84 on 2/8/2017.
 */
    public class Rectangle {
    private double length;
    private double width;



    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }



    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getArea(){
        return length*width;
    }



}
