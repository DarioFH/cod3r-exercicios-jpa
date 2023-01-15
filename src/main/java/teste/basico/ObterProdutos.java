package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> prods = dao.obterTodos();

        for(Produto p: prods){
            System.out.println(p.getNome());
        }

        double precoTotal = prods
                                .stream()
                                .map(p -> p.getPreco())
                                .reduce(0.0,(t, p) -> t + p)
                                .doubleValue();

        System.out.println("Preço total: R$ "+precoTotal);

        dao.fechar();
    }
}
