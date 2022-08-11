package DTO;

import java.util.Date;
import java.util.LinkedList;

public class Mausac extends BaseObject {
    private String mausac;

    public Mausac() {
    }

    public Mausac(String mausac) {
        this.mausac = mausac;
    }

    public Mausac(Long id, String createDate, String mausac) {
        super(id, createDate);
        this.mausac = mausac;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
}

