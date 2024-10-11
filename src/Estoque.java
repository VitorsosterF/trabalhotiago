import java.util.ArrayList;
import java.util.List;

public class Estoque
{
    private List<Produto> produtos;

    public Estoque()
    {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto)
    {
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto)
    {
        this.produtos.remove(produto);
    }

    public void exibirDescontos(double porcentagemDesconto)
    {
        for (Produto produto : produtos)
        {
            double precoFinal = produto.calcularDesconto(porcentagemDesconto);
            System.out.println(produto.getNome() + " - Preço original: RS" +
                    produto.getPreco() + " | Preço após desconto: R$" + precoFinal);
        }
    }
}
