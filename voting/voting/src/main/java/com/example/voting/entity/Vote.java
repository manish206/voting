package com.example.voting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {
    @Id
    private int id;
    private String image_id;
    private String sub_id;
    private String createdat;
    private String val;
    private String countrycode;

    public Vote(){}

    public Vote(int id, String image_id, String sub_id, String createdat, String val, String countrycode) {
        this.id = id;
        this.image_id = image_id;
        this.sub_id = sub_id;
        this.createdat = createdat;
        this.val = val;
        this.countrycode = countrycode;
    }

    public int getId() {
        return id;
    }

    public String getImage_id() {
        return image_id;
    }

    public String getSub_id() {
        return sub_id;
    }

    public String getCreatedat() {
        return createdat;
    }

    public String getval() {
        return val;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    public void setval(String val) {
        this.val = val;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id='" + id + '\'' +
                ", image_id='" + image_id + '\'' +
                ", sub_id='" + sub_id + '\'' +
                ", createdat='" + createdat + '\'' +
                ", val='" + val + '\'' +
                ", countrycode='" + countrycode + '\'' +
                '}';
    }
}
