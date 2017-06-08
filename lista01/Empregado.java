package lista01;

public class Empregado 
{
    private String nome;
    private Endereco endereco;
    private double salario;
    
    public Empregado(String nom, Endereco end, double sal)
    {
        this.nome = nom;
        this.endereco = end;
        this.salario = sal;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nom)
    {
        this.nome = nom;
    }
    
    public Endereco getEndereco()
    {
        return this.endereco;
    }
    
    public void setEndereco(Endereco end)
    {
        this.endereco = end;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void setSalario(double sal)
    {
        this.salario = sal < 0f? 0f : sal;
    }

    public String toString()
    {
        return (
                "\n*Nome:\t\t" + this.getNome() +
                "\n*Salario:\tR$" + this.getSalario() +
                this.endereco.toString());
    }
}
