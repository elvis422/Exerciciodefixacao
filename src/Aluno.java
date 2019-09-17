
public class Aluno
{
    private String nome;
    private String CPF;
    private Data dataDeNascimento;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.CPF;
    }
    
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public void setNome(String n){
        this.nome= n;
    }
    
    public void setCpf(String c){
        this.CPF= c;
    }
    
    public void setdataDeNascimento(Data d){
        this.dataDeNascimento= d;
    }
    
    String imprimir ()
    {
        String aluno = this.nome + "\n" + this.CPF + "\n" + this.dataDeNascimento.imprimir();
        return aluno;
    }
    
}