public class Circulo extends Figura implements Comparable<Figura>{

    private double radio;

    public Circulo(double pRadio) {
        radio = pRadio;
    }

    public int getSides() {
        return 0;
    }

    public double calcularArea() {
        return radio * radio * Math.PI;
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
