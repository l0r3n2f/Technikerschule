/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lorenz
 */
public interface PersonenListe {

    public List<Person> get(int city_ID) throws SakilaException;

    public List<Person> get();

    public Person[] getArray(int city_ID) throws SakilaException;
}
