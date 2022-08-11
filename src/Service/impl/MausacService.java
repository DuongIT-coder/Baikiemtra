package Service.impl;

import DTO.Mausac;
import Service.IColor;

import java.util.LinkedList;

public class MausacService implements IColor {
    @Override
    public LinkedList<Mausac> getAllColor() {
        
        return ColorList();
    }

    @Override
    public void DisplayData(LinkedList<Mausac> ColorList) {
        for (Mausac mausac: ColorList) {
            System.out.println("Mã id: "+ mausac.getId());
            System.out.println("Ngày ra mắt: "+ mausac.getCreateDate());
            System.out.println("Màu sắc: "+ mausac.getMausac());
        }
    }

    public static LinkedList<Mausac> ColorList(){
        LinkedList<Mausac> colorList = new LinkedList<>();
        colorList.add(new Mausac(1L,"2020/8/7","màu đỏ"));
        colorList.add(new Mausac(2L,"2020/8/7","màu đen"));
        colorList.add(new Mausac(3L,"2020/8/7","màu trắng"));
        return colorList;
    }
}
