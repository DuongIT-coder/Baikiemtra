package Service;

import DTO.Maytinh;

import java.util.LinkedList;

public interface IComputer {
    LinkedList<Maytinh> getAllComputer();
    void DisplayData(LinkedList<Maytinh> ComputerList);
    void getMoney(int cost,int amount);
}
