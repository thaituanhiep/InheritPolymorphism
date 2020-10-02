package cylinder;

public class MenuTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(5);
        System.out.println(circle.getArea());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(4);
        cylinder.setHeight(2.3);
        cylinder.setColor("blue");
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
