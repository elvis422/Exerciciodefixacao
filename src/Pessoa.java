
public class Pessoa {
    private String nome;
    private int idade;
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setNome(String n){
        this.nome= n;
    }
    
    public void setIdade(int i){
        this.idade= i;
    }
    
    void fazAniversario()
    {
        this.idade += 1;
    }
    
}
