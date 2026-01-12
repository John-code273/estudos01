import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();


        System.out.println("Insira os dados do produto");
        System.out.print("nome: ");
        produto.nome = sc.nextLine();
        System.out.print("preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("quantidade: ");
        produto.quantidade = sc.nextInt();
        System.out.println("dados do produto: " + produto);
        System.out.print("adicione mais quanidade do produto: ");
        int add = sc.nextInt();
        produto.adicionar(add);
        System.out.println("dados do produto: " + produto);
        System.out.print("remova quanidade do produto: ");
        int rem = sc.nextInt();
        produto.remover(rem);
        System.out.println("dados do produto: " + produto);

    }
}

