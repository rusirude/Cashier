/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.persistance.daoImpl;

import com.leaf.cashier.Utility.HibernateUtil;
import com.leaf.cashier.persistance.dao.UserDAO;
import com.leaf.cashier.persistance.entity.User;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author Rusiru
 */
public class UserDAOImpl implements UserDAO{


    @Override
    public User getUserByUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> from = query.from(User.class);
        query.select(from);
        query.where(
                builder.equal(from.get("username"), username)
        );        
        return session.createQuery(query).getSingleResult();
    }
    
}
