package com.license.everydayshisha.Model.DAO;

import javax.persistence.*;

@Entity
@Table (name = "flavours")
public class Flavour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFlavour")
    private int idFlavour;

    @Column(name = "flavourName")
    private String flavourName;

    @Column(name = "amount")
    private int amount; //cantitatea in grame al aromei

    public Flavour() {
        this.idFlavour = 0;
        this.flavourName = "flavourName";
        this.amount = 0;
    }

    public Flavour(int idFlavour, String flavourName, int amount) {
        this.idFlavour = idFlavour;
        this.flavourName = flavourName;
        this.amount = amount;
    }

    public int getIdFlavour() {
        return idFlavour;
    }

    public void setIdFlavour(int idFlavour) {
        this.idFlavour = idFlavour;
    }

    public String getFlavourName() {
        return flavourName;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Flavour{" +
                "idFlavour=" + idFlavour +
                ", flavourName='" + flavourName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
