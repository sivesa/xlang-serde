package com.beta.version.xlang_serde.serde_util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Person {

    @JsonProperty("firstName")
    @JacksonXmlProperty(localName = "FirstName")
    private String firstName;
    
    @JsonProperty("lastName")
    @JacksonXmlProperty(localName = "LastName")
    private String lastName;

    @JsonProperty("age")
    @JacksonXmlProperty(localName = "Age")
    private int age;

    @JsonProperty("email")
    @JacksonXmlProperty(localName = "Email")
    private String email;

    // Constructors, getters, and setters
    public Person() {
    }

    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

