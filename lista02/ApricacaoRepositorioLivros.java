package lista02;
import java.util.Scanner;

public class ApricacaoRepositorioLivros 
{
    public static void main(String[] args)
    {
        RepositorioLivros repo = new RepositorioLivros();
        Scanner scan = new Scanner(System.in);
        int auxSair = 0;
        int auxCodigo;
        int auxCodigoBusca;
        String auxTitulo;
        String auxAutor;
        Livro auxLivro;
        Livro[] auxLivros;
        
        do
        {
            System.out.println("\n\n1.Inserir livro");
            System.out.println("2.Buscar livro");
            System.out.println("3.Remover livro");
            System.out.println("4.Alterar livro");
            System.out.println("5.Listar todos os livros");
            System.out.println("6.Sair\n");
            System.out.print("Opcao: ");

            switch(Integer.parseInt(scan.nextLine()))
            {       
                case 1:
                {   
                    do
                    {
                        System.out.println("Insira o codigo do livro: ");

                        auxCodigo = Integer.parseInt(scan.nextLine());

                        if(repo.buscar(auxCodigo) != null || auxCodigo < 0)
                        {
                            System.out.println("Entrada invalida!");
                        }
                    }
                    while(repo.buscar(auxCodigo) != null || auxCodigo < 0);

                    do
                    {
                        System.out.println("Insira o nome do livro: ");

                        auxTitulo = scan.nextLine();

                        if (auxTitulo == null)
                        {
                            System.out.println("Entrada invalida!");
                        }
                    }
                    while(auxTitulo == null);

                    do
                    {
                        System.out.println("Insira o nome do autor: ");

                        auxAutor = scan.nextLine();

                        if (auxAutor == null)
                        {
                            System.out.println("Entrada invalida!");
                        }
                    }
                    while(auxAutor == null);

                    auxLivro = new Livro(auxCodigo, auxTitulo, auxAutor);

                    repo.inserir(auxLivro);
                }
                break;

                case 2: 
                {
                    do
                    {
                        System.out.println("\n\nInsira o codigo do livro: ");
                        auxCodigo = Integer.parseInt(scan.nextLine());

                        auxLivro = repo.buscar(auxCodigo);

                        if(auxLivro == null)
                        {
                            System.out.println("Esse livro nao existe!");
                        }
                    }
                    while(auxLivro == null);

                    System.out.println(auxLivro.toString());
                }
                break;

                case 3:
                {
                    do
                    {
                        System.out.println("\nInsira o codigo do livro: ");
                        auxCodigo = Integer.parseInt(scan.nextLine());

                        auxLivro = repo.buscar(auxCodigo);

                        if(auxLivro == null)
                        {
                            System.out.println("Esse livro nao existe!");
                        }
                    }
                    while(auxLivro == null);

                    repo.remover(auxCodigo);
                }
                break;

                case 4:
                {

                    do
                    {
                        System.out.println("\nInsira o codigo do livro que deseja alterar: ");
                        auxCodigo = Integer.parseInt(scan.nextLine());

                        auxLivro = repo.buscar(auxCodigo);

                        if(auxLivro == null)
                        {
                            System.out.println("Esse livro nao existe!");
                        }
                    }
                    while(auxLivro == null);

                    do
                    {
                        System.out.println("Insira o novo nome do livro: ");

                        auxTitulo = scan.nextLine();

                        if (auxTitulo == null)
                        {
                            System.out.println("Entrada invalida!");
                        }
                    }
                    while(auxTitulo == null);

                    do
                    {
                        System.out.println("Insira o novo nome do autor: ");

                        auxAutor = scan.nextLine();

                        if (auxAutor == null)
                        {
                            System.out.println("Entrada invalida!");
                        }
                    }
                    while(auxAutor == null);

                    auxLivro = new Livro(auxCodigo, auxTitulo, auxAutor);

                    repo.alterar(auxLivro);
                }
                break;

                case 5:
                {
                    auxLivros = repo.getLivros();

                    for(int i = 0; i < repo.getQuantLivros(); i++)
                    {
                        System.out.print("\n\nLivro " + (i + 1) + ":" + auxLivros[i].toString());
                    }
                }
                break;
                
                default:
                {
                    auxSair = 1;
                }
            }
        }
        while(auxSair != 1);
    }
}
