package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by eliasibz on 31/10/16.
 */
@Entity
public class SoilHumidity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private float mesure;

    public SoilHumidity() {
    }

    public SoilHumidity(String name, float mesure) {
        this.name = name;
        this.mesure = mesure;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMesure() {
        return mesure;
    }

    public void setMesure(float mesure) {
        this.mesure = mesure;
    }

    @Override
    public String toString() {
        return "com.SoilHumidity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mesure=" + mesure +
                '}';
    }
}
