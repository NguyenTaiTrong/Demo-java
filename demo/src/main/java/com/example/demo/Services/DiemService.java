package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Model.Diem;

import org.springframework.stereotype.Component;

// import com.example.demo.Controller.Diem;

@Component
public class DiemService {
    ArrayList<Diem> listDiem = new ArrayList<Diem>();

    public DiemService() {
        listDiem.add(new Diem(1, 10f, 1));
        listDiem.add(new Diem(1, 5.6f, 2));
        listDiem.add(new Diem(1, 6.5f, 3));
    }

    public Diem getDiemOfSv(int id) {
        for (Diem diem : listDiem) {
            if (diem.getSvId() == id) {
                return diem;
            }
        }
        return null;
    }
}
