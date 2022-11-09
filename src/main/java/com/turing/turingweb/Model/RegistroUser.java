package com.turing.turingweb.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "registrouser")

public class RegistroUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long idUser;

    private String name;

   
    private String country;

    
    private String email;

   
    private String city;
    
    private Integer phone;
     
    private String message;

    private String company;


    
    public RegistroUser() {
    }
    

    public RegistroUser(String name, String country, String email, String city, Integer phone, String message,
            String company) {
        this.name = name;
        this.country = country;
        this.email = email;
        this.city = city;
        this.phone = phone;
        this.message = message;
        this.company = company;
    }


    @Override
    public String toString() {
        return "RegistroUser [idUser=" + idUser + ", name=" + name + ", country=" + country + ", email=" + email
                + ", city=" + city + ", phone=" + phone + ", message=" + message + ", company=" + company + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
     
}
