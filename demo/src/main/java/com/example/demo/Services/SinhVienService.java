
package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Model.SinhVien;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * SinhVienService
 */
@Component
public class SinhVienService {

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    public SinhVienService() {
        list.add(new SinhVien(1, "Sv a", "code123", 1));
        list.add(new SinhVien(2, "Sv b", "code456", 2));
        list.add(new SinhVien(3, "Sv c", "code789", 3));
    }

    public ArrayList<SinhVien> getAll() {
        return list;
    }

    public SinhVien getSv(int id) {
        for (SinhVien result : list) {
            if (result.getId() == id) {
                return result;
            }
        }
        return null;
    }

    public boolean createdSv(SinhVien sv) {
        if (sv != null) {
            list.add(sv);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteSv(int id) {
        SinhVien sv = getSv(id);
        if (sv != null) {
            list.remove(sv);
            return true;
        } else {
            return false;
        }
    }

    public SinhVien searchSv(String searchString) {
        for (SinhVien result : list) {
            if (result.getTen().equals(searchString)) {
                return result;
            }
        }
        return null;
    }

}