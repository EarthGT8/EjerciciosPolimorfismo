// Clase abstracta base
abstract class Figura {
    abstract double calcularArea();

    void mostrarNombre() {
        System.out.println("Esta es una figura");
    }
}

// Subclase concreta
class Rectangulo extends Figura {
    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }
}

// Clase principal para ejecutar
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        rectangulo.mostrarNombre();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}