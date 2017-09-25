/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.Inventory;
import Service.ExceptionsDAO;
import Service.InsufficientQuantity;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jyoun
 */
public class DAO_Testing {
    private Inventory dao = new InventoryImpl();
    Item item;
    public DAO_Testing() {
    }
    
    @BeforeClass
    public static void setUpClass() throws ExceptionsDAO {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ExceptionsDAO, InsufficientQuantity {
        List<Item>getAllItems = dao.getAllItems();
        for (Item item : getAllItems) {
            dao.getItem(item.getItemId());
        }
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetItems() throws ExceptionsDAO, InsufficientQuantity {
       Item item1 = new Item("05");
        item1.setItemId("B01");
        item1.setItemName("SNICKERS");
        item1.setItemPrice(BigDecimal.TEN);
        item1.setQuantity(5);
        dao.getItem(item1.getItemId());

        Item fromDao = dao.getItem(item1.getItemId());
        assertEquals(item, fromDao);
    
        
        
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
