
public class Porta {
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    
    public boolean getAberta(){
        return this.aberta;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getDimensaox(){
        return this.dimensaoX;
    }
    
    public int getDimensaoy(){
        return this.dimensaoY;
    }
    
    public int getDimensaoz(){
        return this.dimensaoZ;
    }
    
    public void setAberta(boolean a){
        this.aberta= a;
    }
    
    public void setCor(String c){
        this.cor= c;
    }
    
    public void setDimensaox(int dx){
        this.dimensaoX= dx;
    }
    
    public void setDimensaoy(int dy){
        this.dimensaoX= dy;
    }
    
    public void setDimensaoz(int dz){
        this.dimensaoX= dz;
    }
    
    void abre()
    {
        this.aberta = true;
    }
    void fecha()
    {
        this.aberta = false;
    }
    void pinta(String s)
    {
        this.cor = s;
    }
    boolean estaAberta()
    {
        if(aberta)
            return true;
       else
            return false;
    }

}
