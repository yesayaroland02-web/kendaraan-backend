package com.example.kendaraan.service;

import com.example.kendaraan.entity.Kendaraan;
import com.example.kendaraan.repository.KendaraanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KendaraanService {

    private final KendaraanRepository repository;

    public KendaraanService(KendaraanRepository repository) {
        this.repository = repository;
    }

    public List<Kendaraan> findAll() {
        return repository.findAll();
    }

    public Kendaraan findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Kendaraan save(Kendaraan kendaraan) {
        return repository.save(kendaraan);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}