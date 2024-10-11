import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        double porcentagemDesconto = -1;
        int tipoProduto = 0;
        int opcao;
        String nomeProduto = "";
        double precoProduto = 0;

        do
        {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao)
            {
                case 1:
                    System.out.println("Digite o tipo do prouduto");
                    System.out.println("1 - Roupa");
                    System.out.println("2 - Móvel");
                    tipoProduto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = scanner.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    precoProduto = scanner.nextDouble();

                    System.out.println("Digite a porcentagem de desconto a ser aplicada nos produtos: ");
                    porcentagemDesconto = scanner.nextDouble();

                    break;

                case 2:
                    if (porcentagemDesconto < 0)
                    {
                        System.out.println("Seu estoque está vazio");
                        continue;
                    }
                    else
                    {
                        estoque.exibirDescontos(porcentagemDesconto);
                    }

                case 3:
                    break;

            }

            Produto produto;
            if (tipoProduto == 1)
            {
                produto = new ProdutoRoupa(nomeProduto,precoProduto);
            }
            else if (tipoProduto == 2)
            {
                produto = new ProdutoMovel(nomeProduto,precoProduto);
            }
            else
            {
                System.out.println("Tipo de produto inválido");
                continue;
            }

            estoque.adicionarProduto(produto);


        } while (opcao != 3);

        scanner.close();
    }

    public static void exibirMenu()
    {
        System.out.println("\n------------------------");
        System.out.println("Cadastro de Produtos");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Exbir lista de produtos");
        System.out.println("3 - Sair");
        System.out.println("------------------------\n");
    }
}