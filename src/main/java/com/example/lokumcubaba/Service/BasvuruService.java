package com.example.lokumcubaba.Service;


import com.example.lokumcubaba.Entity.Basvuru;

import java.util.List;

public interface BasvuruService {

    List<Basvuru> findAll();

    Basvuru save(Basvuru basvuru);
}