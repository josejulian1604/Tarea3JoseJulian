public class Rectangulo extends Figura implements Comparable<Figura>{
    
    private double base;
    private double altura;
    private int sides = 4;

    public Rectangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }

    public int getSides() {
        return sides;
    }
    public double calcularArea() {
        return base * altura;
    }

    public int compareTo(Figura figure) {
        
        double figureArea = figure.calcularArea();
        double miArea = this.calcularArea();

        if(miArea == figureArea) {
            if(this.getSides() == figure.getSides())
                return 0;
            
            else if(this.getSides() > figure.getSides())
                return 1;
            
            else
                return -1;
        }
        else if(miArea > figureArea) 
            return 1;
        
        else
            return -1; 
    }
}
