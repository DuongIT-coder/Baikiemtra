package DTO;

import java.util.Date;

public abstract class BaseObject {

    private Long id;
    private String createDate;

    public BaseObject() {
    }

    public BaseObject(Long id, String createDate) {
        this.id = id;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

