
public class TestaCasa
{
    public static void main (String [] args)
    {
        Casa c1 = new Casa();
        
        c1.setCor(" Rosa ");
        
        Porta p1 = new Porta();
        p1.fecha();
        Porta p2 = new Porta();
        p2.fecha();
        Porta p3 = new Porta();
        p3.abre();
        
        c1.setPorta1(p1);
        c1.setPorta2(p2);
        c1.setPorta3(p3);
        
        System.out.println(c1.quantasPortasEstaoAbertas());
        
    }
}
