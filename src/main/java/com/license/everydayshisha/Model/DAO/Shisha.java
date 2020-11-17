package com.license.everydayshisha.Model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shisha")
public class Shisha {

    @Id
    @Column(name = "idShisha")
    private int idShisha;

    @Column(name = "shishaName")
    private String shishaName;

    @Column(name = "size")
    private int size;

    @Column(name = "hoseCount")
    private int hoseCount;

    public Shisha(int idShisha, String shishaName, int size, int hoseCount) {
        this.idShisha = idShisha;
        this.shishaName = shishaName;
        this.size = size;
        this.hoseCount = hoseCount;
    }

    public Shisha() {
        this.idShisha = 0;
        this.shishaName = "shishaName";
        this.size = 0;
        this.hoseCount = 0;
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
