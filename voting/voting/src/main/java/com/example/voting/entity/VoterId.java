package com.example.voting.entity;

public class VoterId {
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public VoterId(){}
    public VoterId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VoterId{" +
                "id='" + id + '\'' +
                '}';
    }
}
