package Esercitazione5;

//cose toste, dobbiamo estendere la classe Point2D quidni questa la scriviamo così
//quello che facciamo è creare una classe figlia
public class Point3D extends Point2D {
    
    private double z;

    public Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }


    @Override
    public String toString() {
        //return "<" + x + "> , <" + y + "> , <" + z + ">";
        //è una scrittura che non va bene perché i punti x e y sono privati e
        //non possono essere visti dall'esterno, abbiamo bisogno
        //di definire un metodo in Point2D per passare i punti
        return "<" + getX() + "> , <" + getY() + "> , <" + z + ">";
    }

}
