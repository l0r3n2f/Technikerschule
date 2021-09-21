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
public interface StaedteListe {

    public List<Stadt> get(int country_ID) throws SakilaException;
    
    public List<Stadt> get() throws SakilaException;

    public Stadt[] getArray(int country_ID) throws SakilaException;
    //getmethode für alle Städte

    public void insert(Stadt stadt);

    public void update(Stadt stadt);

    public void delete(Stadt stadt);

}
