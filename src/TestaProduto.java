
public class TestaProduto {
    
    public static void main (String [] args)
    {
        Produto p1 = new Produto();
        p1.setPreco(2000.00);
        p1.setNome("Computador");
        p1.diminuir10();
        
        String dados = p1.getNome() + "\n" + p1.getPreco();
        System.out.println(dados);
        
        
        Produto p2 = new Produto();
        p2.setPreco(2000.00);
        p2.setNome("Computador");
        p2.aumentar25();
        
        String dados2 = p2.getNome() + "\n" + p2.getPreco();
        System.out.println(dados2);
        
    }
    
}
