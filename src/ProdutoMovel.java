public class ProdutoMovel extends Produto
{
    public ProdutoMovel(String nome, double preco)
    {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto (double porcentagem)
    {
        double desconto = preco * porcentagem / 100;
        return preco - (desconto > 40 ? 40 : desconto);
    }
}
