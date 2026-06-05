package com.example.kendaraan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kendaraan")
public class Kendaraan {

    @Id
    @Column(name = "no_registrasi")
    private String noRegistrasi;

    @Column(nullable = false)
    private String namaPemilik;

    private String alamat;

    @Column(name = "merk_kendaraan")
    private String merkKendaraan;

    @Column(name = "tahun_pembuatan")
    private Integer tahunPembuatan;

    @Column(name = "kapasitas_silinder")
    private Integer kapasitasSilinder;

    @Column(name = "warna_kendaraan")
    private String warnaKendaraan;

    @Column(name = "bahan_bakar")
    private String bahanBakar;

    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public Integer getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(Integer tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public Integer getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(Integer kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
}