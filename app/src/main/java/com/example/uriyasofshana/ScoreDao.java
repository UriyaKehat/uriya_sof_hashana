package com.example.uriyasofshana;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ScoreDao {
    @Insert
    void insert(Score s);

    @Update
    void update(Score s);

    @Delete
    void delete(Score s);

    @Query("SELECT * FROM Score")
    List<Score>getAllFromDataBase();

    @Query("SELECT * FROM Score WHERE id = :id")
    Score getScoreById(int id);
}
