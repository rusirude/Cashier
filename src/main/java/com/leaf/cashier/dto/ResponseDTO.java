/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.dto;

import java.util.Objects;

/**
 *
 * @author Rusiru
 */
public class ResponseDTO {
    
    private String code;
    private String message;

    public ResponseDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
    
    
}
