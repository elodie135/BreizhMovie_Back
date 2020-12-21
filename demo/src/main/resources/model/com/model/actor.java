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
    private String firstName;
    private String lastName;

    public entityClassName() {
    }

    public entityIdType getId() {
        return id;
    }

    public void setId(entityIdType id) {
        this.id = id;
    }
}

public class actor {

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
