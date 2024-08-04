package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadatroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Samsung Galaxy A20");
        celular.setDescricao("Funciona bem");
        celular.setPreco(new BigDecimal("1000"));

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();



    }
}
