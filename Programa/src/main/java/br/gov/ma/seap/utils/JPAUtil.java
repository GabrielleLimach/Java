package br.gov.ma.seap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    // o nome da persistenceunitname deve ser a mesma que foi adicionada no persistence.xml em persistence-unit -> name
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dblembrete");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
