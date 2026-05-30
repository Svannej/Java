package Esercitazione5;

public class TestPoint {
    
    public static void main(String[] args) {
        Point2D punto2 = new Point2D(10.4, 2.6);
        System.out.println("--IL PUNTO a 2 DIMENSIONI--");
        System.out.println(punto2.toString());
        System.out.println("--UN punto A 3 DIMENSIONI--");
        Point3D punto3 = new Point3D(11.5, 23.4, 10.9);
        System.out.println(punto3.toString());
    }


}
