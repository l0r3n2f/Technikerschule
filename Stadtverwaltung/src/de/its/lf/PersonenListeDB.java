/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenz
 */
public class PersonenListeDB implements PersonenListe {

    private DBConnector dBConnector;

    public PersonenListeDB(DBConnector dBConnector) {
        this.dBConnector = dBConnector;
    }

    @Override
    public List<Person> get(int city_ID) throws SakilaException {
        
        
        dBConnector.connect();

        List<Person> personenListe = new ArrayList<>();
        ResultSet rs = dBConnector.query("SELECT * \n"
                + "from customer ,address, city\n"
                + "where customer.address_id = address.address_id\n"
                + "and address.city_id = city.city_id\n"
                + "and address.city_id = " + city_ID);
        try {
            while (rs.next()) {
                Person person = new Person();

                person.setCustomer_ID(rs.getInt("customer_id"));

                person.setCustomer_Firstname(rs.getString("first_name"));
                person.setCustomer_Lastname(rs.getString("last_name"));
                personenListe.add(person);
            }
        } catch (SQLException ex) {
              throw new SakilaException("Datenverarbeitung hat nicht funktioniert");
        }
        dBConnector.disconnect();

        return personenListe;
    }

    @Override
    public Person[] getArray(int city_ID) throws SakilaException {
        List<Person> personenliste = get(city_ID);
        Person[] array = new Person[personenliste.size()];
        return personenliste.toArray(array);
    }

    @Override
    public List<Person> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
