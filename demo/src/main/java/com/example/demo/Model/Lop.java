package com.example.demo.Model;

public class Lop {
    private  int Id;
    private  String TenLop;

    public Lop(int id, String tenLop) {
        Id = id;
        TenLop = tenLop;
    }

    public Lop() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lop{" +
                "Id=" + Id +
                ", TenLop='" + TenLop + '\'' +
                '}';
    }
}
