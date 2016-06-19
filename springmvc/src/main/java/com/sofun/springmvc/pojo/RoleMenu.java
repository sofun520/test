package com.sofun.springmvc.pojo;

import java.io.Serializable;

public class RoleMenu implements Serializable{
    private Integer rmId;

    private Integer rmRoleId;

    private Integer rmMenuId;

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public Integer getRmRoleId() {
        return rmRoleId;
    }

    public void setRmRoleId(Integer rmRoleId) {
        this.rmRoleId = rmRoleId;
    }

    public Integer getRmMenuId() {
        return rmMenuId;
    }

    public void setRmMenuId(Integer rmMenuId) {
        this.rmMenuId = rmMenuId;
    }
}