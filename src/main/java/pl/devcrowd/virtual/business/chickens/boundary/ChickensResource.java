/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.devcrowd.virtual.business.chickens.boundary;

import java.util.List;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import pl.devcrowd.virtual.business.chickens.entity.Chicken;

// Rest control adaptor
/**
 *
 * @author sam
 */
@Path("chickens")  // always plurail
public class ChickensResource {
    
    @Inject
    ChickenService cs;
    
    @GET
    public List<Chicken> chickens() {    // normally you return response
        return cs.getAllChickens();
    }
    
    @POST
    public void  save(JsonObject chicken) {
        String name = chicken.getString("name");
        int age = chicken.getInt("age");
        cs.save(new Chicken(name, age));                
    }
    
}
