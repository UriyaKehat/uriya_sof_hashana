package com.example.uriyasofshana;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Score.class},version = 1)
public abstract class DataBase extends RoomDatabase {
}
