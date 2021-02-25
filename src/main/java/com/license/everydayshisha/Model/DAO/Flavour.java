package com.license.everydayshisha.Model.DAO;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "flavours")
public class Flavour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFlavour")
    private int idFlavour;

    @NotBlank
    @Size(min = 2, message = "Flavour Name must have at least 2 characters")
    @Pattern(regexp = "[a-zA-Z \\p{Punct}]+", message = "Flavour name can only contain letters")
    @Column(name = "flavourName")
    private String flavourName;

    @NotNull
    @Range(max = 100000, message = "You cannot hold more than 100kg of one flavour")
    @PositiveOrZero(message = "The size cannot negative")
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
