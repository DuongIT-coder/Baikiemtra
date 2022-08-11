package Service.impl;

import DTO.Maytinh;
import Service.IComputer;
import baikiemtra.ThucThi;

import java.util.LinkedList;

public class MaytinhService implements IComputer {
    @Override
    public LinkedList<Maytinh> getAllComputer() {
        return ComputerList();
    }
    @Override
    public void DisplayData(LinkedList<Maytinh> ComputerList) {
        for (Maytinh maytinh: ComputerList) {
            System.out.println("Mã id: "+ maytinh.getId());
            System.out.println("Ngày ra mắt: "+ maytinh.getCreateDate());
            System.out.println("Mẫu máy: "+ maytinh.getTenmay());
            System.out.println("Giá : "+ maytinh.getCost());
        }
    }

    public static LinkedList<Maytinh> ComputerList(){
        LinkedList<Maytinh>computerList = new LinkedList<>();
        computerList.add(new Maytinh(1L, "2018/12/17","máy trạm", 10000000 ));
        computerList.add(new Maytinh(2L, "2020/8/18","máy xách tay", 14000000 ));
       return computerList;
    }
    @Override
    public void getMoney(int cost,int amount) {
        System.out.println("Số tiền bạn cần phải trả là: "+ cost*amount);
    }
}