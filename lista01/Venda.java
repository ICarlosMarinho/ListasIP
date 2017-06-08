package lista01;

public class Venda 
{
    private String codigo;
    private String descricao;
    private double precoItem;
    private int quantidadeItens;
    
    public Venda(String cod, String desc, double prec, int quant)
    {
        this.codigo = cod;
        this.descricao = desc;
        this.precoItem = prec;
        this.quantidadeItens = quant;
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo(String cod)
    {
        this.codigo = cod;
    }
    
    public String getDescricao()
    {
        return this.descricao;
    }
    
    public void setDescricao(String desc)
    {
        this.descricao = desc;
    }
    
    public double getPrecoItem()
    {
        return this.precoItem;
    }
    
    public void setPrecoItem(double prec)
    {
        this.precoItem = prec;
    }
    
    public int getQuantidadeItens()
    {
        return this.quantidadeItens;
    }
    
    public void setQuantidadeItens(int quant)
    {
        this.quantidadeItens = quant;
    }
    
    public void adicionarItem(int qtdItens)
    {
        if(qtdItens <= 0)
        {
            System.out.println("\nEntrada invalida.");
        }
        else
        {
            this.quantidadeItens += qtdItens;
        }
    }
    
    public double calcularPrecoTotalVenda()
    {
        return (this.precoItem * this.quantidadeItens);
    } 
    
    public String toString()
    {
        return ("\n*Codigo:\t" + this.getCodigo() +
                "\n*Descricao:\t" + this.getDescricao() +
                "\n*Preco (Und.):\t" + this.getPrecoItem()+ 
                "\n*Quantidade em estoque:\t" + this.getQuantidadeItens());
    }
}
