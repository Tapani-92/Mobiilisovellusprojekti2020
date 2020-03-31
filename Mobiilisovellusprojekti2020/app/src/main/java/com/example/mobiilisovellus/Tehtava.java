package com.example.mobiilisovellus;

import java.io.Serializable;
import java.util.ArrayList;


public class Tehtava implements Serializable {

    private String nimi;
    private String paivamaara;
    private int suoritettu;
    private ArrayList aliTehtava;


    public Tehtava(String n, String d, int p) {
        this.nimi = n;
        this.paivamaara = d;
        this.suoritettu = p;

    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(String paivamaara) {
        this.paivamaara = paivamaara;
    }

    public int getSuoritettu() {
        return suoritettu;
    }

    public void setSuoritettu(int suoritettu) {
        this.suoritettu = suoritettu;
    }

    public ArrayList getAliTehtava() {
        return aliTehtava;
    }

    public void setAliTehtava(ArrayList aliTehtava) {
        this.aliTehtava = aliTehtava;
    }
}
