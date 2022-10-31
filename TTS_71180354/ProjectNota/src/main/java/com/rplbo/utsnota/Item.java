package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    Item(KertasHVS[] kertas) {
        this.krhvs = kertas;
    }

    Item(BukuTulis[] buku) {
        this.bktulis = buku;
    }

    Item(Pulpen[] pulpen) {
        this.pen = pulpen;
    }

    Item(BukuTulis[] buku, Pulpen[] pulpen) {
        this.bktulis = buku;
        this.pen = pulpen;
    }

    Item(KertasHVS[] kertas, Pulpen[] pulpen) {
        this.krhvs = kertas;
        this.pen = pulpen;
    }

    Item(BukuTulis[] buku, KertasHVS[] kertas) {
        this.bktulis = buku;
    }

    Item(BukuTulis[] buku, KertasHVS[] kertas, Pulpen[] pulpen) {
        this.bktulis = buku;
        this.krhvs = kertas;
        this.pen = pulpen;
    }

    public BukuTulis[] getBktulis() {
        return this.bktulis;
    }

    public KertasHVS[] getKrhvs() {
        return this.krhvs;
    }

    public Pulpen[] getPen() {
        return this.pen;
    }

    public int getJumlahBukuTulis() {
        int hitung = 0;

        for(int i = 0; i < this.bktulis.length; ++i) {
            ++hitung;
        }

        return hitung;
    }

    public int getJumlahPen() {
        int hitung = 0;

        for(int i = 0; i < this.pen.length; ++i) {
            ++hitung;
        }

        return hitung;
    }

    public int getJumlahKertasHVS() {
        int hitung = 0;

        for(int i = 0; i < this.krhvs.length; ++i) {
            ++hitung;
        }

        return hitung;
    }
}
