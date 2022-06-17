package com.demo.petstore.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EcoPointStandard {
    
    @Id @GeneratedValue
    Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Long getCountweightstandard() {
        return countweightstandard;
    }

    public void setCountweightstandard(Long countweightstandard) {
        this.countweightstandard = countweightstandard;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    String name;

    @Enumerated
    Classification classification;

    Long countweightstandard;

    Long point;


}
