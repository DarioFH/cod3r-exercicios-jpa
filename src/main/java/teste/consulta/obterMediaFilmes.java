package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class obterMediaFilmes {
    public static void main(String[] args) {
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);

        NotaFilme media = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(media.getMedia());

        dao.fechar();
    }
}
