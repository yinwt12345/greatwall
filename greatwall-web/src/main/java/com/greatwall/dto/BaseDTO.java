package com.greatwall.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/07/22 0022.
 */
public class BaseDTO implements Serializable {


    private static final long serialVersionUID = 8025458443254002918L;

    private String id;

    public BaseDTO(){}

    public BaseDTO(String id){this.id = id;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
