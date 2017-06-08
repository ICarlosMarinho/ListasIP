package lista01;

public class ContaCorrente 
{
    private int numero;
    private double saldo;
    
    public ContaCorrente(int num, double sal)
    {
        this.numero = num;
        this.saldo = sal;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public void setNumero(int num)
    {
        this.numero = num;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public boolean creditar(double valor)
    {
        if (valor <= 0)
        {
            System.out.println("O valor para crédito deve ser positivo!");
            
            return false;
        }
        else
        {
            this.saldo += valor;
            
            return true;
        }
    }
    
    public boolean debitar(double valor)
    {
        if ((this.saldo - valor) < 0)
        {
            System.out.println("Saldo insuficiente!");

            return false;
        }
        else if (valor <= 0)
        {
            System.out.println("O valor para débito deve ser positivo!");
            
            return false;
        }
        else
        {
            this.saldo -= valor;
            
            return true;
        }
    }
    
    public boolean transferir(double valor, ContaCorrente c2)
    {
        if (valor <= 0)
        {
            System.out.println("O valor para transferência deve ser positivo!");
            
            return false;
        }
        else if (c2 == null)
        {
            System.out.println("A conta informada não existe!");
            
            return false;
        }
        else if ((this.saldo - valor) < 0)
        {
            System.out.println("Saldo insuficiente!");
            
            return false;
        }
        else 
        {
            this.saldo -= valor;
            
            c2.saldo += valor;
            
            return true;
        }
    }  
    
    public String toString()
    {
        return ("[Numero: " + this.getNumero() + "\tSaldo: R$" + this.getSaldo() + "]");
    }
}