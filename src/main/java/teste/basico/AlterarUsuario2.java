package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 6L);
        usuario.setNome("Leonardo Leitao");

        em.getTransaction().begin();
        //em.merge(usuario);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
