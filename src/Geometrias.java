import java.util.Arrays
;
public class Geometrias {
    public static void main(String[] args) throws Exception {
        
        Rectangulo rectangle = new Rectangulo(10.34, 5.7);
        Triangulo triangle = new Triangulo(12.4, 10);
        Circulo circle = new Circulo(4.0);
        
        System.out.println("El area del rectangulo es: " + rectangle.calcularArea());
        System.out.println("El area del triangulo es: " + triangle.calcularArea());
        System.out.println("El area del circulo es: " + circle.calcularArea());

        System.out.println("El area del rectangulo es mayor(1) igual(0) menor(-1) que la del circulo: " + rectangle.compareTo(circle));
        System.out.println("El area del rectangulo es mayor(1) igual(0) menor(-1) que la del triangulo: " + rectangle.compareTo(triangle));
    }
}
