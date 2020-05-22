package com.example.restServiceDemo;

import javax.persistence.*;

@Entity
@Table(name="Persons")

public class Person {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "Personid", columnDefinition = "int default 100")
    private Integer PersonId;
    @Column(name="Firstname", columnDefinition="text")
    private String FirstName;
    @Column(name="Lastname", columnDefinition="text")
    private String LastName;
    @Column(name="City", columnDefinition="text")
    private String City;



    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + PersonId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public void setPersonId(Integer personId) {
        PersonId = personId;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getPersonId() {
        return PersonId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCity() {
        return City;
    }
}
