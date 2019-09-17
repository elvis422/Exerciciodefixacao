
public class Casa
{
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public String getCor(){
        return this.cor;
    }
    
    public Porta getPorta1(){
        return this.porta1;
    }
    
    public Porta getPorta2(){
        return this.porta2;
    }
    
    public Porta getPorta3(){
        return this.porta3;
    }
    
    public void setCor(String c){
        this.cor= c;
    }
    
    public void setPorta1(Porta p1){
        this.porta1= p1;
    }
    
    public void setPorta2(Porta p2){
        this.porta1= p2;
    }
    
    public void setPorta3(Porta p3){
        this.porta1= p3;
    }
    
  
    
    void pinta(String s)
    {
        this.cor = s;
    }
    int quantasPortasEstaoAbertas()
    {
        int cont = 0;
        if(this.porta1.estaAberta() == true)
            cont = 1;
        if(this.porta2.estaAberta() == true)
            cont += 1;
        if(this.porta3.estaAberta() == true)
            cont += 1;
        
        return cont;
    }
}

