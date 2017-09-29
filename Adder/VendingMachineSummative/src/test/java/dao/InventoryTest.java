/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class InventoryTest {
    
    private Inventory dao = new InventoryImpl();
    
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ExceptionsDAO {
        List<Item>itemList = dao.getAllItems();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllItems method, of class Inventory.
     */
    @Test
    public void testGetAllItems() throws Exception {
        assertEquals(5, dao.getAllItems().size());
        
    }

    /**
     * Test of BigDecimal method, of class Inventory.
     */
    @Test
    public void testBigDecimal() throws Exception {
        BigDecimal bd1 = new BigDecimal (1000);
        BigDecimal bd2 = new BigDecimal (1000);
        assertEquals(bd1,bd2);
    }

    /**
     * Test of getItem method, of class Inventory.
     */
    @Test
    public void testGetItem() throws Exception {
        Item fromInventory = dao.getItem("B01");
        assertEquals("TWIX", fromInventory.getItemName());
        assertEquals(4, fromInventory.getQuantity());
    }

}
