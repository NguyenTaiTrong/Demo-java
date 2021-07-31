package com.example.demo.Model;

import java.util.ArrayList;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;


public class SinhVien {
    
    private  int Id;
    private  String Ten;
    private String MaSV;
    private int LopId;

    public SinhVien(int id, String ten, String maSV, int lopId) {
        Id = id;
        Ten = ten;
        MaSV = maSV;
        LopId = lopId;
    }

    public SinhVien() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public int getLopId() {
        return LopId;
    }

    public void setLopId(int lopId) {
        LopId = lopId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SinhVien{" +
                "Id=" + Id +
                ", Ten='" + Ten + '\'' +
                ", MaSV='" + MaSV + '\'' +
                ", LopId=" + LopId +
                '}';
    }
}