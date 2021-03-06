/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.UsuMen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jesus
 */
@Stateless
public class UsuMenFacade extends AbstractFacade<UsuMen> {
    @PersistenceContext(unitName = "MasUNETPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuMenFacade() {
        super(UsuMen.class);
    }
    
}
