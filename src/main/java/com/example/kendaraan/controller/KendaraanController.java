package com.example.kendaraan.controller;

import com.example.kendaraan.entity.Kendaraan;
import com.example.kendaraan.service.KendaraanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kendaraan")
@CrossOrigin("*")
public class KendaraanController {

    private final KendaraanService service;

    public KendaraanController(KendaraanService service) {
        this.service = service;
    }

    @GetMapping
    public List<Kendaraan> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Kendaraan getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Kendaraan create(@RequestBody Kendaraan kendaraan) {
        return service.save(kendaraan);
    }

    @PutMapping("/{id}")
    public Kendaraan update(
            @PathVariable String id,
            @RequestBody Kendaraan kendaraan) {

        kendaraan.setNoRegistrasi(id);
        return service.save(kendaraan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}