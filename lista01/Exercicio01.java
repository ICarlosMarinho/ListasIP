package lista01;

public class Exercicio01 
{
    public void executarResposta()
    {
        System.out.println("[Padrão 01]\n");
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
        
        System.out.println("\n[Padrão 02]\n");
        
        for (int i = 10; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }      
}
