package baikiemtra;

import DTO.Khachhang;
import Service.IColor;
import Service.IComputer;
import Service.IType;
import Service.impl.KieuService;
import Service.impl.MausacService;
import Service.impl.MaytinhService;

import java.util.Date;
import java.util.Scanner;

import static Service.impl.KieuService.TypeList;
import static Service.impl.MausacService.ColorList;
import static Service.impl.MaytinhService.ComputerList;

public class ThucThi {
    static Scanner sc = new Scanner(System.in);
    static IComputer iComputer = new MaytinhService();
    static IColor iColor = new MausacService();
    static IType iType = new KieuService();


    public static void main(String[] args) {

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của bạn: ");
        int age = sc.nextInt();sc.nextLine();
        Khachhang custommer = new Khachhang(name,age);
        iComputer.DisplayData(iComputer.getAllComputer());
        System.out.println("Bạn chọn loại máy nào: ");
        int computer = sc.nextInt();sc.nextLine();
        System.out.println("Nhập số lượng bạn muốn mua: ");
        int amount = sc.nextInt();sc.nextLine();
        iType.DisplayData(iType.getAllType());
        System.out.println("Bạn chọn kiểu máy nào: ");
        int type = sc.nextInt();sc.nextLine();
        iColor.DisplayData(iColor.getAllColor());
        System.out.println("Bạn chọn màu gì: ");
        int color = sc.nextInt();sc.nextLine();
        System.out.println("Đặt hàng thành công!");
        Date date= new Date();
        System.out.println("Tên bạn là: " + custommer.getName());
        System.out.println("Tuổi: " + custommer.getAge());
        iComputer.getMoney((ComputerList().get(computer).getCost()),amount);
        System.out.println(date);
    }
}

