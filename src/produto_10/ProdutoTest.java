package produto_10;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira", 150.00);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.setNome("Mesa");
        produto.setPreco(200.00);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        try {
            produto.setPreco(-50.00);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
