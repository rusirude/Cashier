/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.bl;

import com.leaf.cashier.Utility.HibernateUtil;
import com.leaf.cashier.dto.ResponseDTO;
import com.leaf.cashier.persistance.dao.UserDAO;
import com.leaf.cashier.persistance.daoImpl.UserDAOImpl;
import org.hibernate.Session;

/**
 *
 * @author Rusiru
 */
public class UserBL {
    public static ResponseDTO login(String username,String password){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{            
            session.getTransaction().begin();
            UserDAO userDAO = new UserDAOImpl();
            System.out.println(userDAO.getUserByUsername(username).toString());
            session.getTransaction().commit();
            
        }
        catch(Exception e){
            session.getTransaction().rollback();
            
            System.out.println(e);
        }
        finally{
            session.close();            
        }
        
        return null;
    }
}
