package com.sss.cloud.springoffer.entity;

import java.io.Serializable;

/**
 * 
 * @author auto create
 * @since 1.0,2018-09-03 19:46:40
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5052602452482643L;

    private Integer uid;//

    private String uname;//

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

}
