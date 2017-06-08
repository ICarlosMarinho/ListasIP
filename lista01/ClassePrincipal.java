package lista01;
import java.util.Scanner;

public class ClassePrincipal 
{
    private static final float AUMENTO = (float)1.1;
    
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in);
        
        //##RESPOSTA DO EXERCICIO 1 E 2##
        
        Exercicio01 exer01 = new Exercicio01();
        Exercicio02 exer02 = new Exercicio02();
        
        exer01.executarResposta();
        exer02.executarResposta();
        
        //##RESPOSTA DO EXERCICIO 3##
        
        ContaCorrente c1 = new ContaCorrente(123, 50f);
        ContaCorrente c2 = new ContaCorrente(456, 9f);
        
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        
        //**Deposito na Conta 1
        
        System.out.print("\nDigite o valor a ser creditado: ");
        
        if (c1.creditar(scan.nextDouble()) == true)
        {
            System.out.println("\nOperação realizada com sucesso!\n"+ "c1: " + c1.toString());
        }
        else
        {
            System.out.println("\nFalha na operação.\n" + "c1: " + c1.toString());
        }
        
        //**Saque na Conta 2
        
        System.out.print("\nDigite o valor a ser debitado: ");
        
        if (c2.debitar(scan.nextDouble()) == true)
        {
            System.out.println("\nOperação realizada com sucesso!\n"+ "c2: " + c2.toString());
        }
        else
        {
            System.out.println("\nFalha na operação.\n" + "c2: " + c2.toString());
        }
        
        //**Deposito na conta 2
        
        System.out.print("\nDigite o valor a ser creditado: ");
        
        if (c2.creditar(scan.nextDouble()) == true)
        {
            System.out.println("\nOperação realizada com sucesso!\n"+ "c2: " + c2.toString());
        }
        else
        {
            System.out.println("\nFalha na operação.\n" + "c2: " + c2.toString());
        }
        
        //**Saque na conta 1
        
        System.out.print("\nDigite o valor a ser debitado: ");
        
        if (c1.debitar(scan.nextDouble()) == true)
        {
            System.out.println("\nOperação realizada com sucesso!\n"+ "c1: " + c1.toString());
        }
        else
        {
            System.out.println("\nFalha na operação.\n" + "c1: " + c1.toString());
        }
        
        //**Transferencia da conta 1 para a 2
        
        System.out.print("\nDigite o valor a ser transferido para a conta c2: ");
        
        if (c1.transferir(scan.nextDouble(), c2) == true)
        {
            System.out.println("\nOperação realizada com sucesso!\n"+ "c1: " + c1.toString() + "\nc2: " + c2.toString());
        }
        else
        {
            System.out.println("\nFalha na operação.\n" + "c1: " + c1.toString() + "\nc2: " + c2.toString());
        }
        
        
        Endereco end1 = new Endereco("Rua do Sossego", "011", "Recife", "Boa Vista", "00000-001");
        Endereco end2 = new Endereco("Rua da Concordia", "022", "Recife", "Sao Jose", "00000-002");

        Empregado e1 = new Empregado("Jose Silva", end1, 1000f);
        Empregado e2 = new Empregado("Joao Paulo", end2, 1400f);

        for (int i = 0; i < 2;)
        {
            System.out.println(e1.toString() + "\n*Salario anual: R$" + (e1.getSalario() * 12));
            System.out.println(e2.toString() + "\n*Salario anual: R$" + (e2.getSalario() * 12));
            
            e1.setSalario(e1.getSalario() * AUMENTO);
            e2.setSalario(e2.getSalario() * AUMENTO);
            
           i++;
        } 
        
        
        System.out.println("Endereco 1: " + end1.toString());
        System.out.println("\nEndereco 2" +end2.toString());
        
        //##RESPOSTA DO EXERCICIO 4##
        
        Fatorial f = new Fatorial();
        Long num;
        
        System.out.println("Digite um numero: ");
        num = scan.nextLong();
        
        System.out.println("\nO fatorial de " + num + " é " + f.efetuarFatorial(num));
        
        
        //##RESPOSTA DO EXERCICIO 5##
        
        Venda v1 = new Venda("00001", "Item localizado no 1º andar setor 3A", (double)15, (int)100);
        
        System.out.println("Detalhes de v1:\n" + v1.toString());
        
        System.out.print("\nInsira a quantidade de itens a ser adicionada: ");
        
        v1.adicionarItem(scan.nextInt());
        
        System.out.println("\nDetalhes de v1:\n" + v1.toString());
        
        System.out.println("\nPreco total da venda de v1: R$" + v1.calcularPrecoTotalVenda());
        
        
        
        //##RESPOSTA DO EXERCICIO 6##
        
        LivroNotas n1 = new LivroNotas();
        
        do
        {
            System.out.print("Insira a nota: ");
        }
        while (n1.adicionaNota(scan.nextDouble()) >= 0);  
        
        System.out.println("\n\n*Quantidade de notas:\t" + n1.getQtdNotas() + "\n*Media:\t" + n1.calcularMedia());
    }   
}
