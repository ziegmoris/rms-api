package com.ita3.rmsapi.model;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {
    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    protected Person() {
    }

    public Person(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "PERSON_GEN", allocationSize = 1, sequenceName = "PERSON_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_GEN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
