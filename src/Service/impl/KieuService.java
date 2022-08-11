package Service.impl;

import DTO.Kieu;
import Service.IType;

import java.util.LinkedList;

public class KieuService implements IType {


    @Override
    public LinkedList<Kieu> getAllType() {
        System.out.println("vào đây");
        return TypeList();
    }

    @Override
    public void DisplayData(LinkedList<Kieu> TypeList) {
        for (Kieu type: TypeList) {
            System.out.println("Mã id: "+type.getId());
            System.out.println("Ngày ra mắt: "+type.getCreateDate());
            System.out.println("Kiểu máy: "+type.getTenkieumay());

        }
    }

    public static LinkedList<Kieu> TypeList() {
        LinkedList<Kieu> typeList = new LinkedList<>();
        typeList.add(new Kieu(1L, "2006/12/26", "64bit"));
        typeList.add(new Kieu(2L, "2006/12/26", "128bit"));
        return typeList;
    }
}
