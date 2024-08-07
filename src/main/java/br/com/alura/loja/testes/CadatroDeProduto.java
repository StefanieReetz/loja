package br.com.alura.loja.testes;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;
import javax.persistence.EntityManager;



public class CadatroDeProduto {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Categoria celulares = new Categoria("CELULARES");

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        em.flush();
        em.clear();

        em.merge(celulares);
        celulares.setNome("1234");
        em.flush();
    }

}

