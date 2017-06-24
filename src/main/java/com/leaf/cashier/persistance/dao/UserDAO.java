/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.persistance.dao;

import com.leaf.cashier.persistance.entity.User;

/**
 *
 * @author Rusiru
 */
public interface UserDAO {
    /**
     * Get User By Username
     * @param username
     * @return User-Entity
     */
    User getUserByUsername(String username);
}
