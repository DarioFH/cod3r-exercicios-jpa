package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Star Wars Ep 4", 8.9);
        Filme filmeB = new Filme("O Fugitivo", 8.1);

        Ator atorA = new Ator("Harrison Ford");
        Ator atorB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        atorB.adicionarFilme(filmeA);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.abrirT().incluir(filmeA).incluir(filmeB).fecharT().fechar();
    }
}
