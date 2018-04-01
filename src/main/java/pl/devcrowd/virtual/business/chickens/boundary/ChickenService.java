/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.devcrowd.virtual.business.chickens.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import pl.devcrowd.virtual.business.chickens.control.ChickenStore;
import pl.devcrowd.virtual.business.chickens.entity.Chicken;

/**
 *
 * @author sam
 */
@Stateless
public class ChickenService {
    
    @Inject
    ChickenStore chickenStore;
    
    public List<Chicken> getAllChickens() {
        return this.chickenStore.all();
    }
    
    public void save(Chicken chicken) {
        this.chickenStore.save(chicken);
    }
}
