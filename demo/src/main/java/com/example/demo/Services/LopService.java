package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Model.Lop;

import org.springframework.stereotype.Component;

@Component
public class LopService {
    ArrayList<Lop> listLop = new ArrayList<Lop>();
    public LopService()
    {
        listLop.add(new Lop(1, "16zaq1"));
        listLop.add(new Lop(2, "16zaq2"));
        listLop.add(new Lop(3, "16zaq3"));
    }


}
