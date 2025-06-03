package com.example.uriyasofshana;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Score.class},version = 1)
public abstract class DataBase extends RoomDatabase {
    private static DataBase instance;

    public abstract ScoreDao ScoreDao();

    public static synchronized DataBase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    DataBase.class,
                    "Score_db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
