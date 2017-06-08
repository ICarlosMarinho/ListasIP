package lista01;

public class LivroNotas 
{
    private double somaDasNotas;
    private int qtdeNotas;
    
    public LivroNotas()
    {
        
    }
    
    public int getQtdNotas()
    {
        return this.qtdeNotas;
    }
    
    public double getSomaDasNotas()
    {
        return this.somaDasNotas;
    }
    
    public double adicionaNota(double add)
    {
        if(add >= 0)
        {
            this.somaDasNotas += add;
            this.qtdeNotas++;
        }   
        return add;
    }
    
    public double calcularMedia()
    {
        return (this.somaDasNotas / this.qtdeNotas);
    }
}