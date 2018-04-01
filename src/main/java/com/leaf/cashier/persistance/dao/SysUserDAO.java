/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.persistance.dao;

import com.leaf.cashier.persistance.entity.SysUser;



/**
 *
 * @author Rusiru
 */
public interface SysUserDAO {
    /**
     * Get SysUser By Username
     * @param username
     * @return SysUser-Entity
     */
    SysUser getSysUserByUsername(String username);
}
