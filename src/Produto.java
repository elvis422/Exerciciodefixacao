
public class Produto
{
    private double preco;
    private String nome;
    
    public double getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(double p){
        this.preco= p;
    }
    
    public void setNome(String n){
        this.nome= n;
    }
    
    void diminuir10()
    {
        double diminuir = (10 * this.preco) / 100;
        this.preco -= diminuir;
    }
    
    void aumentar25()
    {
        double aumentar = (25 * this.preco) / 100;
        this.preco += aumentar;
    }
}

