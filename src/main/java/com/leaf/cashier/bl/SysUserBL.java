/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.bl;

import com.leaf.cashier.Utility.HibernateUtil;
import com.leaf.cashier.dto.ResponseDTO;
import com.leaf.cashier.enums.DefaultStatusEnum;
import com.leaf.cashier.enums.ResponseCodeEnum;
import com.leaf.cashier.persistance.dao.SysUserDAO;
import com.leaf.cashier.persistance.daoImpl.SysUserDAOImpl;
import com.leaf.cashier.persistance.entity.SysUser;
import org.hibernate.Session;

/**
 *
 * @author Rusiru
 */
public class SysUserBL {

    public static ResponseDTO login(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        String responseCode = ResponseCodeEnum.FAILD.getCode();
        try {
            session.getTransaction().begin();
            SysUserDAO sysUserDAO = new SysUserDAOImpl();
            SysUser sysUser = sysUserDAO.getSysUserByUsername(username);

            if (sysUser == null) {
                
            }
            else if (!password.equals(sysUser.getPassword())) {
                
            }

            else if (!DefaultStatusEnum.ACTIVE.getCode().equals(sysUser.getStatus().getCode())) {
            } 
            
            else {
                responseCode = ResponseCodeEnum.SUCCESS.getCode();
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();           
        } finally {
            session.close();
        }

        return new ResponseDTO(responseCode, "");
    }
}
