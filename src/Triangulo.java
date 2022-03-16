public class Triangulo extends Figura implements Comparable<Figura> {
    
    private double base;
    private double altura;
    private int sides = 3;

    public Triangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }

    public int getSides() {
        return sides;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public int compareTo(Figura figure) {

        double figureArea = figure.calcularArea();
        double thisArea = this.calcularArea();

        if(thisArea == figureArea) {
            if(this.getSides() == figure.getSides())
                return 0;
            
            else if(this.getSides() > figure.getSides())
                return 1;
            
            else
                return -1;
        }
        else if(thisArea > figureArea)
            return 1;
        
        else
            return -1;
    }
}
