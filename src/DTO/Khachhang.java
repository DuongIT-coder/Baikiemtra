package DTO;

public class Khachhang extends BaseObject{
    private String name;
    private int age;

    public Khachhang() {
    }

    public Khachhang(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Khachhang(Long id, String createDate, String name, int age) {
        super(id, createDate);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
