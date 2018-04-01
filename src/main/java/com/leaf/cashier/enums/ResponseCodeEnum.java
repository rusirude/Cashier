package com.leaf.cashier.enums;

import com.leaf.cashier.Utility.CommonConstant;

/**
 * @author : Rusiru on 31-Jan-18.
 */
public enum ResponseCodeEnum {
    SUCCESS(CommonConstant.RESPONSE_CODE_SUCCESS),
    FAILD(CommonConstant.RESPONSE_CODE_FAILD);


    private String code;

    ResponseCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static ResponseCodeEnum getEnum(String code){
        switch (code){
            case CommonConstant.RESPONSE_CODE_SUCCESS:
                return SUCCESS;
            default:
                return FAILD;
        }
    }
}
