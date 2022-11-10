package com.turing.turingweb.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Long iduser;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
   
    
   

    public User(Long iduser, String name, String email, String country, String city) {
        this.iduser = iduser;
        this.name = name;
        this.email = email;
        this.country = country;
        this.city = city;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User [iduser=" + iduser + ", name=" + name + ", email=" + email + ", country=" + country + ", city="
                + city + "]";
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   
    

    

}
