package DTO;

import java.util.Date;
import java.util.LinkedList;

public class Maytinh extends BaseObject{
   private String tenmay;
   private int cost;

    public Maytinh() {
    }

    public Maytinh(String tenmay, int cost) {
        this.tenmay = tenmay;
        this.cost = cost;
    }

    public Maytinh(Long id, String createDate, String tenmay, int cost) {
        super(id, createDate);
        this.tenmay = tenmay;
        this.cost = cost;
    }

    public String getTenmay() {
        return tenmay;
    }

    public void setTenmay(String tenmay) {
        this.tenmay = tenmay;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
