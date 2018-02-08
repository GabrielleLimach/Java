package br.gov.ma.seap.daos;

import br.gov.ma.seap.models.Lembrete;
import br.gov.ma.seap.utils.JPAUtil;

import javax.persistence.EntityManager;

public class LembreteDAO {

    private EntityManager entityManager;

    public LembreteDAO() {
        this.entityManager = JPAUtil.getEntityManager();
    }

    public void salvar(Lembrete lembrete) {
        entityManager.getTransaction().begin();
        entityManager.persist(lembrete);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
