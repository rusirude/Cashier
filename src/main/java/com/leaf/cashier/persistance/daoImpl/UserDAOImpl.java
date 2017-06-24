/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.persistance.daoImpl;

import com.leaf.cashier.Utility.HaibernateUtil;
import com.leaf.cashier.persistance.dao.UserDAO;
import com.leaf.cashier.persistance.entity.User;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

/**
 *
 * @author Rusiru
 */
public class UserDAOImpl implements UserDAO{


    @Override
    public User getUserByUsername(String username) {
        Session session = HaibernateUtil.getSessionFactory().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        return null;
    }
    
}
