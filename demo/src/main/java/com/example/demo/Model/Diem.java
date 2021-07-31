package com.example.demo.Model;

public class Diem {
    private int Id;
    private float DiemTb;
    private int SvId;

    public Diem(int id, float diemTb, int svId) {
        Id = id;
        DiemTb = diemTb;
        SvId = svId;
    }

    public Diem() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getDiemTb() {
        return DiemTb;
    }

    public void setDiemTb(float diemTb) {
        DiemTb = diemTb;
    }

    public int getSvId() {
        return SvId;
    }

    public void setSvId(int svId) {
        SvId = svId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Diem{" +
                "Id=" + Id +
                ", DiemTb=" + DiemTb +
                ", SvId=" + SvId +
                '}';
    }
}
