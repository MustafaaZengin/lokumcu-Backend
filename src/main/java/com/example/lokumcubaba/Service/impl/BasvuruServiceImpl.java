package com.example.lokumcubaba.Service.impl;


import com.example.lokumcubaba.Entity.Basvuru;
import com.example.lokumcubaba.Repository.BasvuruRepo;
import com.example.lokumcubaba.Service.BasvuruService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BasvuruServiceImpl implements BasvuruService{

    private final Logger log = LoggerFactory.getLogger(BasvuruServiceImpl.class);
    private final BasvuruRepo basvuruRepository;

    @Autowired
    public BasvuruServiceImpl(BasvuruRepo basvuruRepository){
        this.basvuruRepository = basvuruRepository;
    }

    @Override
    public List<Basvuru> findAll() {
        log.debug("Request to get all Basvurular");
        return basvuruRepository.findAll();
    }
    @Override
    public Basvuru save(Basvuru basvuru) {
        log.debug("Request to save Basvuru");
        return basvuruRepository.save(basvuru);
    }
}
