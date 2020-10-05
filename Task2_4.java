package Project2_4;

public class Main {
    public static void main(String[] args) {
        Shape sp = new Shape();
        new Box(100).add(sp);
    }
}
class Shape{
    double volume = 10;
    double getVolume(){
        return volume;
    }
}
abstract class SolidOfRevolution extends Shape {
    double radius;
    double getRadius() {
        return radius;
    }
}
class Cylinder extends SolidOfRevolution {
    double height;
}
class Ball extends SolidOfRevolution{ }
class Pyramid extends Shape{
    double s;
    double h;
    double volume;
}
class Box extends Shape {
    double box_volume;
    public Box(double box_volume){
        this.box_volume = box_volume;
    }
    boolean add(Shape shp) {
        double shape_volume = shp.getVolume();
        if (shape_volume < this.box_volume) {
            Shape sp = new Shape();
            new Box(this.box_volume - shape_volume).add(sp);
            return true;
        } else {
            return false;
        }
    }
}
