package Service;

import DTO.Mausac;
import DTO.Maytinh;

import java.util.LinkedList;

public interface IColor {
    LinkedList<Mausac> getAllColor();
    void DisplayData(LinkedList<Mausac> ColorList);

}
