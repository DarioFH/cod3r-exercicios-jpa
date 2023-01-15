package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class NovoProduto {
    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);
        Produto prod = new Produto("Notebook", 1231.21);
        dao.IncluirAtomico(prod).fechar();

        System.out.println(prod.getId());

    }
}
