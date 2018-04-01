/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.persistance.daoImpl;

import com.leaf.cashier.Utility.HibernateUtil;
import com.leaf.cashier.enums.DeleteStatusEnum;
import com.leaf.cashier.persistance.entity.SysUser_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import com.leaf.cashier.persistance.dao.SysUserDAO;
import com.leaf.cashier.persistance.entity.Status_;
import com.leaf.cashier.persistance.entity.SysUser;

/**
 *
 * @author Rusiru
 */
public class SysUserDAOImpl implements SysUserDAO{


    @Override
    public SysUser getSysUserByUsername(String username) {
        SysUser sysUser = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<SysUser> query = builder.createQuery(SysUser.class);
        Root<SysUser> root = query.from(SysUser.class);
        query.select(root);
        query.where(
                builder.and(
                        builder.equal(root.get(SysUser_.username), username),
                        builder.notEqual(root.get(SysUser_.status).get(Status_.code), DeleteStatusEnum.DELETE.getCode())
                )
        );        
        return session.createQuery(query).getSingleResult();
    }
    
}
