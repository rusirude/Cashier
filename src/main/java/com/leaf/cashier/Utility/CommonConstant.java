/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaf.cashier.Utility;

/**
 *
 * @author Rusiru
 */
public class CommonConstant {
    
    private static final String RESOURCES_FILE_PATH = "/resources";
    public static final String HIBERNATE_PROPERTIES_FILE_PATH = RESOURCES_FILE_PATH + "/hibernate.properties";
    public static final String HIBERNATE_CONFIGURATION_FILE_PATH = RESOURCES_FILE_PATH + "/hibernate.cfg.xml";
    
    
    /*------------ Response Code -------------------*/        
     
    public static final String RESPONSE_CODE_SUCCESS = "SUCCESS";    
    public static final String RESPONSE_CODE_FAILD = "FAILD";        
    /*------------ Status Category Code -------------------*/

    public static final String STATUS_CATEGORY_DEFAULT = "DEFAULT";
    public static final String STATUS_CATEGORY_DELETE = "DELETE";

     /*------------ Default Status Code -------------------*/

    public static final String DELETE_STATUS_DELETE = "DELETE";

    /*------------ Default Status Code -------------------*/

    public static final String DEFAULT_STATUS_ACTIVE = "ACTIVE";
    public static final String DEFAULT_STATUS_DEACTIVE = "DEACTIVE";
}
