/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import database.Musiques;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class MusiquesFacade extends AbstractFacade<Musiques> implements MusiquesFacadeLocal {
    @PersistenceContext(unitName = "LK-Medias-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MusiquesFacade() {
        super(Musiques.class);
    }
    
}
