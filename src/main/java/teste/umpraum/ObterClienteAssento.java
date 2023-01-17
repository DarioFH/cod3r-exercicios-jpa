package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        Cliente cliente = daoCliente.obterPorId(2L);
        System.out.println("Consulta Cliente -> Assento");
        System.out.println(cliente.getNome()+" - "+cliente.getAssento().getNome());
        daoCliente.fechar();

        System.out.println("----------------------------------------------------------");

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(2L);
        System.out.println("Consulta Assento -> Cliente");
        System.out.println(assento.getNome()+" - "+assento.getCliente().getNome());
        daoAssento.fechar();

    }
}
