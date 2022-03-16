package com.example.myapplication;

import java.io.Serializable;

public class Banh implements Serializable {
    private int hinhNen;
    private String ten;
    private String moTa;
    private double gia;

    public int getHinhNen() {
        return hinhNen;
    }

    public void setHinhNen(int hinhNen) {
        this.hinhNen = hinhNen;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Banh(int hinhNen, String ten, String moTa, double gia) {
        this.hinhNen = hinhNen;
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    public Banh() {
    }

    @Override
    public String toString() {
        return "Banh{" +
                "hinhNen=" + hinhNen +
                ", ten='" + ten + '\'' +
                ", moTa='" + moTa + '\'' +
                ", gia=" + gia +
                '}';
    }
}
