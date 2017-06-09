package lista02;

public class Livro 
{
    private int codigo;
    private String titulo;
    private String autor;
    
    public Livro(int codigo, String titulo, String autor)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public boolean equals(Livro liv)
    {
        return !(liv == null || this.codigo != liv.getCodigo());
    }
    
    public String toString()
    {
        return ("\n\n*Codigo:\t" + this.codigo 
                + "\n*Titulo:\t" + this.titulo 
                + "\n*Autor:\t\t" + this.autor);
    }
}
