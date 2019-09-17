
public class Esfera {
    private double raio;
    public double getRaio(){
        return this.raio;
    }
            
    public void setRaio(double r){
        this.raio= r;
    }
    double volumeEsfera(){
            
            
        double volume = (4.0 / 3.0) * 3.14 * (this.raio * this.raio * this.raio);
                return volume;
    }
    
}

