/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.devcrowd.virtual.business.chickens.control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.devcrowd.virtual.business.chickens.entity.Chicken;

/**
 *
 * @author sam
 */
public class ChickenStore {
    
    @PersistenceContext
    EntityManager em;
    
    public void save(Chicken chicken) {
        em.merge(chicken);        
    }
    
    public List<Chicken> all() {
        return this.em.createNamedQuery("all", Chicken.class).getResultList();
    }
    
    
    
    
}
