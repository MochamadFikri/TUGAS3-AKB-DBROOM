package com.example.tugas3_akb_dbroom;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila Akbar
// Kelas : IF-5
// Pengerjaan : 1 Mei 2020

@Dao
public interface AktivisDao {
    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);

}
