package DTO;

import java.util.Date;
import java.util.LinkedList;

public class Kieu extends BaseObject {
    private String tenkieumay;

    public Kieu() {
    }

    public Kieu(String tenkieumay) {
        this.tenkieumay = tenkieumay;
    }

    public Kieu(Long id, String createDate, String tenkieumay) {
        super(id, createDate);
        this.tenkieumay = tenkieumay;
    }

    public String getTenkieumay() {
        return tenkieumay;
    }

    public void setTenkieumay(String tenkieumay) {
        this.tenkieumay = tenkieumay;
    }
}