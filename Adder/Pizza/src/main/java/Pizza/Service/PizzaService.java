/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza.Service;

import PizzaDao.PizzaDao;

/**
 *
 * @author jyoun
 */
public class PizzaService {
    private PizzaDao dao;
    
    public PizzaService(PizzaDao dao){
        this.dao = dao;
    }
    public Pizza create (pizza p) 
}
