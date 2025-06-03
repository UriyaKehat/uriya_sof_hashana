package com.example.uriyasofshana;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Score")
public class Score {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(String playerScore) {
        this.playerScore = playerScore;
    }

    private String playerScore;
}
