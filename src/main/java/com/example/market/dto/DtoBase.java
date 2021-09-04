package com.example.market.dto;

import com.example.market.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class DtoBase <E extends ModelBase>{

    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YY-MM-DD'T'HH:mm:ss.sssxxx")
    private Date createdOn;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YY-MM-DD'T'HH:mm:ss.sssxxx")
    private Date updatedOn;

    private long version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
