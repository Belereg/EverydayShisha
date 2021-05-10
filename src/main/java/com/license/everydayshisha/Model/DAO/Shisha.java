package com.license.everydayshisha.Model.DAO;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "shishas")
public class Shisha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idShisha")
    private int idShisha;

    @NotBlank
    @Size(min = 2, message = "Shisha name must have at least 2 characters")
    @Pattern(regexp = "[a-zA-Z0-9 \\p{Punct}]+", message = "Shisha name can only contain letters")
    @Column(name = "shishaName")
    private String shishaName;

    @NotNull
    @Range(min = 20, max = 250, message = "The size of the shisha must be between 20 and 250")
    @PositiveOrZero(message = "The size cannot be 0 or negative")
    @Column(name = "size")
    private int size;

    @NotNull
    @Range(max = 10, message = "The hoses count of the shisha must be between 1 and 10")
    @Positive(message = "The hoses count cannot be 0 or negative")
    @Column(name = "hoseCount")
    private int hoseCount;

    public Shisha() {
        this.idShisha = 0;
        this.shishaName = "shishaName";
        this.size = 0;
        this.hoseCount = 0;
    }

    public Shisha(int idShisha, String shishaName, int size, int hoseCount) {
        this.idShisha = idShisha;
        this.shishaName = shishaName;
        this.size = size;
        this.hoseCount = hoseCount;
    }

    public int getIdShisha() {
        return idShisha;
    }

    public void setIdShisha(int idShisha) {
        this.idShisha = idShisha;
    }

    public String getShishaName() {
        return shishaName;
    }
    public void setShishaName(String shishaName) {
        this.shishaName = shishaName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHoseCount() {
        return hoseCount;
    }

    public void setHoseCount(int hoseCount) {
        this.hoseCount = hoseCount;
    }

    @Override
    public String toString() {
        return "Shisha{" +
                "idShisha=" + idShisha +
                ", shishaName='" + shishaName + '\'' +
                ", size=" + size +
                ", hoseCount=" + hoseCount +
                '}';
    }
}
