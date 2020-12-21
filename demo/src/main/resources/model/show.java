package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class entityClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private entityIdType id;
    private int Date;

    public entityClassName() {
    }

    public entityIdType getId() {
        return id;
    }

    public void setId(entityIdType id) {
        this.id = id;
    }
}

public class show {

    /**
     * @return int return the Date
     */
    public int getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(int Date) {
        this.Date = Date;
    }

}
