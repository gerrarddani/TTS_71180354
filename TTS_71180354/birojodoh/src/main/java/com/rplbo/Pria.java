package com.rplbo;

import java.util.Objects;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon) {
        if (!Objects.equals(this.status, "Pacaran")) {
            this.temanKencan = calon;
        } else {
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
        }

    }

    public void MengajakKencan(Perempuan perempuan) {
        if (Objects.equals(this.temanKencan.getNama(), perempuan.getNama())) {
            perempuan.setJumlahCinta(1.0);
            this.jumlahCinta = this.jumlahCinta + 1.0;
        } else {
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }

    }

    public void MenembakKekasih() {
        if (this.temanKencan != null && this.jumlahCinta >= this.temanKencan.getStandarJumlahCinta()) {
            this.jodoh = this.temanKencan;
            this.setStatus("Pacaran");
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU " + this.getNama());
        } else {
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH " + this.getNama() + " !!!");
        }

    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = this.jumlahCinta + jumlahCinta;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getJumlahCinta() {
        return this.jumlahCinta;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getStatus() {
        return this.status;
    }

    public String getNama() {
        return this.nama;
    }

    public Perempuan getJodoh() {
        return this.jodoh;
    }

    public Perempuan getTemanKencan() {
        return this.temanKencan;
    }
}
