package teste.consulta;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

        for(Filme f: filmes){
            System.out.println(f.getNome());

            System.out.println("Lista de atores:");
            for(Ator a: f.getAtores()){
                System.out.println(a.getNome());
            }
        }
        dao.fechar();
    }
}
