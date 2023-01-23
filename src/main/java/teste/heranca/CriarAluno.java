package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class CriarAluno {
    public static void main(String[] args) {
        DAO<Aluno> dao = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "Augustinho");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Otavinho", 1000);

        dao.IncluirAtomico(aluno1);
        dao.IncluirAtomico(aluno2);

        dao.fechar();
    }
}
