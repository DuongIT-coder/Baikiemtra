package Service;

import DTO.Kieu;

import java.util.LinkedList;

public interface IType {
    LinkedList<Kieu> getAllType();
    void DisplayData(LinkedList<Kieu> TypeList);



}
