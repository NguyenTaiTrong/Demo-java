package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Diem;
import com.example.demo.Model.SinhVien;
import com.example.demo.Services.DiemService;
import com.example.demo.Services.SinhVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class SinhVienController {

    @Autowired
    SinhVienService sinhVienService;
    @Autowired
    DiemService diemService;

    public SinhVienController(SinhVienService sinhVienService, DiemService diemService) {
        this.sinhVienService = sinhVienService;
        this.diemService = diemService;
    }

    public SinhVienController() {

    }

    @GetMapping
    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> lsv = new ArrayList<SinhVien>();
        lsv = sinhVienService.getAll();
        return lsv;
    }

    @GetMapping("{id}")
    public SinhVien getSv(@PathVariable("id") int id) {
        SinhVien sv = new SinhVien();
        sv = sinhVienService.getSv(id);
        return sv;
    }

    @GetMapping("{id}/Diem")
    public Diem getDiemOfSv(@PathVariable("id") int id) {
        Diem diemSv = new Diem();
        diemSv = diemService.getDiemOfSv(id);
        return diemSv;
    }

    @PostMapping
    public SinhVien createSv(@RequestBody SinhVien request) {
        SinhVien sv = new SinhVien();
        sv.setId(request.getId());
        sv.setTen(request.getTen());
        sv.setMaSV(request.getMaSV());
        sv.setLopId(request.getLopId());
        boolean result = sinhVienService.createdSv(sv);
        if (result) {
            return sv;
        } else {
            return null;
        }
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int id) {
        return sinhVienService.deleteSv(id);
    }

    @GetMapping("filter")
    public SinhVien getSv(@Param("search") String search) {
        SinhVien sv = new SinhVien();
        sv = sinhVienService.searchSv(search);
        return sv;
    }
}
