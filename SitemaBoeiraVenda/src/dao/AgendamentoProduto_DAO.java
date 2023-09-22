/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AgendamentoProdutoNvb;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05521391142
 */
public class AgendamentoProduto_DAO extends DAO_Abstract {

    public static List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.beginTransaction().commit();    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.beginTransaction().commit();     }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AgendamentoProdutoNvb.class);
        criteria.add(Restrictions.eq("idcliente", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

 
        
    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(AgendamentoProdutoNvb.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;    }

    }
    
