package com.license.everydayshisha.Model.DAO;

import javax.persistence.*;

@Entity
@Table (name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private int idCLient;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "CNP")
    private String CNP;

    @Column(name = "address")
    private String address;

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
