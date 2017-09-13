/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaDao;

import com.mycompany.pizza.Pizza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class PizzaMemoryDao {
    private static List<Pizza> pizzas = new ArrayList<> ();
    
    public List<Pizza> getAll(){
        return pizzas;
    }
    public Pizza create(Pizza p){
        return p;
    }
    public Pizza read(Pizza p) {
        return p;
    }
    public Pizza update(Pizza p) {
        return p;
    }
    public Pizza delte(Pizza p){
        return p;
    }
}
