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
        
        for (int i = 0; i < this.quantLivros; i++) 
        {
            if (liv.getCodigo() == livros[i].getCodigo()) 
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
        for (int i = 0; i < this.quantLivros; i++)
        {
            if (cod == livros[i].getCodigo())
            {
                return livros[i];
            }
        }
        
        return null;
    }
    
    public boolean remover(int cod)
    {
        int i;
        
        for(i = 0; i < this.quantLivros && cod != this.livros[i].getCodigo();)
        {
            i++;
        }
        
        if(i == this.quantLivros)
        {
            return false;
        }
        
        do
        {
            this.livros[i] = this.livros[i + 1];
            
            i++;
        }
        while(i < (this.quantLivros));
        
        this.quantLivros--;
        
        return true;
    }
    
    public boolean alterar(Livro novoLivro)
    {
        int i;
        
        for (i = 0; i < this.quantLivros && livros[i].equals(novoLivro) == false;)
        {
            i++;
        }
        
        if (i == this.quantLivros)
        {
            return false;
        }
        
        livros[i] = novoLivro;
        
        return true;
    }
}
