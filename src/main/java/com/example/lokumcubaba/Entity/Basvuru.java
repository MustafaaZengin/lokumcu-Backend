package com.example.lokumcubaba.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "basvuru")
public class Basvuru {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String isim;
    String adres;
    String posta;
    String perakendeTicaret;
    String lokumcuBabaTercihSebebi;
    String lokumcuBabaAcmaYeriniz;
    String eklemek;
    String tc;
    String telefon;
    Integer yatırım;
    Date dogum_tarihi;

    public Basvuru(){}
    public Date getDogum_tarihi() {
        return dogum_tarihi;
    }
    public void setDogum_tarihi(Date dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getİsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public String getPerakendeTicaret() {
        return perakendeTicaret;
    }

    public void setPerakendeTicaret(String perakendeTicaret) {
        this.perakendeTicaret = perakendeTicaret;
    }

    public String getLokumcuBabaTercihSebebi() {
        return lokumcuBabaTercihSebebi;
    }

    public void setLokumcuBabaTercihSebebi(String lokumcuBabaTercihSebebi) {
        this.lokumcuBabaTercihSebebi = lokumcuBabaTercihSebebi;
    }

    public String getLokumcuBabaAcmaYeriniz() {
        return lokumcuBabaAcmaYeriniz;
    }

    public void setLokumcuBabaAcmaYeriniz(String lokumcuBabaAcmaYeriniz) {
        this.lokumcuBabaAcmaYeriniz = lokumcuBabaAcmaYeriniz;
    }

    public String getEklemek() {
        return eklemek;
    }

    public void setEklemek(String eklemek) {
        this.eklemek = eklemek;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Integer getYatırım() {
        return yatırım;
    }

    public void setYatırım(Integer yatırım) {
        this.yatırım = yatırım;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}