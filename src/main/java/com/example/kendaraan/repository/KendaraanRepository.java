package com.example.kendaraan.repository;

import com.example.kendaraan.entity.Kendaraan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KendaraanRepository
        extends JpaRepository<Kendaraan, String> {
}
