/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.Inventory;
import dao.InventoryImpl;
import dao.InventoryStubImpl;
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
public class ServiceTest {
    private Service service;
    
    public ServiceTest() {
        Inventory dao = new InventoryStubImpl();
        
        service = new Serviceimpl(dao);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllItems method, of class Service.
     */
    @Test
    public void testGetAllItems() throws Exception {
        assertEquals(0, service.getAllItems().size());
    }

    /**
     * Test of getUserChoiceItemPrice method, of class Service.
     */
    @Test
    public void testGetUserChoiceItemPrice() throws Exception {
    }

    /**
     * Test of getChange method, of class Service.
     */
    @Test
    public void testGetChange() throws Exception {
    }

    /**
     * Test of getItemCost method, of class Service.
     */
    @Test
    public void testGetItemCost() throws Exception {
    }

    /**
     * Test of checkSufficientFunds method, of class Service.
     */
    @Test
    public void testCheckSufficientFunds() throws Exception {
    }

    /**
     * Test of pullItem method, of class Service.
     */
    @Test
    public void testPullItem() throws Exception {
        Item item = service.pullItem(item);
        assertNotNull(item);
        item = service.pullItem(item)
        
    }

    
    }
    

