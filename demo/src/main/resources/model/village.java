package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class entityClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private entityIdType id;
    private Strint nameCity;
    private int postCode;

    public entityClassName() {
    }

    public entityIdType getId() {
        return id;
    }

    public void setId(entityIdType id) {
        this.id = id;
    }
}

public class village {

    /**
     * @return Strint return the nameCity
     */
    public Strint getNameCity() {
        return nameCity;
    }

    /**
     * @param nameCity the nameCity to set
     */
    public void setNameCity(Strint nameCity) {
        this.nameCity = nameCity;
    }

    /**
     * @return int return the postCode
     */
    public int getPostCode() {
        return postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

}
