package com.license.everydayshisha.Model.DAO;

import org.hibernate.annotations.BatchSize;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table (name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private int idCLient;

    @NotBlank
    @Size(min = 2, message = "First Name must have at least 2 characters")
    @Pattern(regexp = "[a-zA-Z \\p{Punct}]+", message = "First name can only contain letters")
    @Column(name = "firstName")
    private String firstName;

    @NotBlank
    @Size(min = 2, message = "Last Name must have at least 2 characters")
    @Pattern(regexp = "[a-zA-Z \\p{Punct}]+", message = "Last name can only contain letters")
    @Column(name = "lastName")
    private String lastName;

    @NotBlank
    @Column(name = "CNP")
    @Pattern(regexp = "\\d+", message = "CNP can only contain digits")
    @Size(min = 13, max = 13, message = "CNP must have 13 digits")
    private String CNP;

    @NotBlank
    @Size(min = 2, message = "Address must have at least 2 characters")
    @Column(name = "address")
    private String address;

    @Size(min = 10, max = 10, message = "Phone number must be 10 digits long")
    @Pattern(regexp = "\\d+", message = "Phone number can only contain digits")
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Client(int idCLient, String firstName, String lastName, String CNP, String address, String phoneNumber) {
        this.idCLient = idCLient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Client() {
        this.idCLient = 0;
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.CNP = "CNP";
        this.address = "address";
        this.phoneNumber = "phoneNumber";
    }

    public int getIdCLient() {
        return idCLient;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setIdCLient(int idCLient) {
        this.idCLient = idCLient;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idCLient=" + idCLient +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
