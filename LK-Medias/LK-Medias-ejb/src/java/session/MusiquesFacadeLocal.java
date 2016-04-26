/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import database.Musiques;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MusiquesFacadeLocal {

    void create(Musiques musiques);

    void edit(Musiques musiques);

    void remove(Musiques musiques);

    Musiques find(Object id);

    List<Musiques> findAll();

    List<Musiques> findRange(int[] range);

    int count();
    
}
