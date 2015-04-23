/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.dao;

import com.mycompany.methotels.entities.Soba;
import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Fedor
 */
public class SobaDaoImpl implements SobaDao {

    @Inject
    private Session session;

    @Override
    public List<Soba> getListaSvihSoba() {
        return session.createCriteria(Soba.class).list();
    }

    @Override
    public Soba getSobaById(Integer sobaid) {
        return (Soba) session.createCriteria(Soba.class).add(Restrictions.eq("id", sobaid)).uniqueResult();
    }

    @Override
    public void dodajSobu(Soba soba) {
        session.persist(soba);
    }

    @Override
    public void obrisiSobu(Integer sobaid) {
        Soba soba = (Soba)
        session.createCriteria(Soba.class).add(Restrictions.eq("id", sobaid)).uniqueResult();
        session.delete(soba);
    }
}