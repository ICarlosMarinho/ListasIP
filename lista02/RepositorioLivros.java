package lista02;

public class RepositorioLivros 
{
   private Livro[] livros;
   private int quantLivros;
    
    public RepositorioLivros()
    {
        this.livros  = new Livro[100];
        this.quantLivros = 0;
    }
    
    public Livro[] getLivros()
    {
        return this.livros;
    }
    
    public int getQuantLivros()
    {
        return this.quantLivros;
    }
    
    public boolean inserir(Livro liv)
    {
        if (quantLivros == this.livros.length || liv == null)
        {
            return false;
        }
        
        for (Livro livro : this.livros) 
        {
            if (liv.getCodigo() == livro.getCodigo()) 
            {
                return false;
            }
        }
        
        this.livros[quantLivros] = liv;
        this.quantLivros++;
        
        return true;
    }
    
    public Livro buscar(int cod)
    {
        for (Livro livro : this.livros)
        {
            if (cod == livro.getCodigo())
            {
                return livro;
            }
        }
        
        return null;
    }
    
    //**Desenvolver!!
}
