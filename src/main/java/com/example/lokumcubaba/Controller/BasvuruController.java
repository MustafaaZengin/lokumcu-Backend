package com.example.lokumcubaba.Controller;

import com.example.lokumcubaba.Entity.Basvuru;
import com.example.lokumcubaba.Repository.BasvuruRepo;
import com.example.lokumcubaba.Service.BasvuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.naming.Binding;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BasvuruController {

    private final BasvuruService basvuruService;
    private final BasvuruRepo basvuruRepository;

    public BasvuruController(BasvuruService basvuruService, BasvuruRepo basvuruRepository){
        this.basvuruService = basvuruService;
        this.basvuruRepository = basvuruRepository;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/basvurus")
    public ResponseEntity<List<Basvuru>> getBasvurus() {
        List<Basvuru> basvurus = basvuruService.findAll();
        return new ResponseEntity<>(basvurus, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/basvuru")
    public String addBasvuru(@RequestBody Basvuru basvuru) {
        basvuruRepository.save(basvuru);
        return "1";
    }}