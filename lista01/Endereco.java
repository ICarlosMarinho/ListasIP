package lista01;

public class Endereco 
{
    private String logradouro;
    private String numero;
    private String cidade;
    private String bairro;
    private String cep;
    
    public Endereco(String log, String num, String cid, String bai, String cep)
    {
        this.logradouro = log;
        this.numero = num;
        this.cidade = cid;
        this.bairro = bai;
        this.cep = cep;
    }
    
    public String getLogradouro()
    {
        return this.logradouro;
    }
    
    public void setLogradouro(String log)
    {
        this.logradouro = log;
    }
    
    public String getNumero()
    {
        return this.numero;
    }
    
    public void setNumero(String num)
    {
        this.numero = num;
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public void setCidade(String cid)
    {
        this.cidade = cid;
    }
    
    public String getBairro()
    {
        return this.bairro;
    }
    
    public void setBairro(String bai)
    {
        this.bairro = bai;
    }
    
    public String getCep()
    {
        return this.cep;
    }
    
    public void setCep(String cep)
    {
        this.cep = cep;
    }
    
    public String toString()
    {
        return (
                "\n\nEndereco:\n" +
                "\n*Logradouro:\t" + this.getLogradouro() + 
                "\n*Numero:\t" + this.getNumero() + 
                "\n*Cidade:\t" + this.getCidade() + 
                "\n*Bairro:\t" + this.getBairro() + 
                "\n*CEP:\t\t" + this.getCep());
    }
}
