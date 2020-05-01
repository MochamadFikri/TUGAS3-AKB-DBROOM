package com.example.tugas3_akb_dbroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila Akbar
// Kelas : IF-5
// Pengerjaan : 1 Mei 2020


@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
