/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.ArrayList;
//import java.util.List;



/**
 *
 * @author lorenz
 */
public class Person {

    private final int personID;
    private String name;
    private String vorname;
    private final double gehalt;

    private ArrayList<Konto> konten; //<Konto> führt einen Typecast durch, d.h. alle gespeicherten Objekte werden auf den Typ Konto überprüft 

    public Person(int personID, String name, String vorname, double gehalt) {
        this.personID = personID;
        this.name = name;
        this.vorname = vorname;
        this.gehalt = gehalt;
        konten = new ArrayList<>();

    }

    public void addKonto(Konto konto) {

        konten.add(konto);

    }

    public ArrayList<Konto> getKonten() {
        return konten;
    }

    public int getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getGehalt() {
        return gehalt;
    }
    

}
