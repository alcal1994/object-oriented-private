/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvend;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albert
 */
public class CandyControllerTest {
    
    public CandyControllerTest() {
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
     * Test of selectedItems method, of class CandyController.
     */
    @Test
    public void testSelectedItems() {
        System.out.println("selectedItems");
        CandyController instance = new CandyController();
        instance.selectedItems();
       
    }

    /**
     * Test of getFindTotal method, of class CandyController.
     */
    @Test
    public void testGetFindTotal() {
        System.out.println("getFindTotal");
        CandyController instance = new CandyController();
        double expResult = 0.0;
        double result = instance.getFindTotal();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of findTotal method, of class CandyController.
     */
    @Test
    public void testFindTotal() {
        System.out.println("findTotal");
        CandyController instance = new CandyController();
        instance.findTotal();
        
    }

    /**
     * Test of setChange method, of class CandyController.
     */
    @Test
    public void testSetChange() {
        System.out.println("setChange");
        CandyController instance = new CandyController();
        instance.setChange();
        
    }

    /**
     * Test of getChange method, of class CandyController.
     */
    @Test
    public void testGetChange() {
        System.out.println("getChange");
        CandyController instance = new CandyController();
        double expResult = 0.0;
        double result = instance.getChange();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getMoney method, of class CandyController.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        CandyController instance = new CandyController();
        double expResult = 0.0;
        double result = instance.getMoney();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setMoney method, of class CandyController.
     */
    @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        CandyController instance = new CandyController();
        instance.setMoney();
        
    }

    /**
     * Test of clear method, of class CandyController.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CandyController instance = new CandyController();
        instance.clear();
       
    }

    /**
     * Test of formatMoney method, of class CandyController.
     */
    @Test
    public void testFormatMoney() {
        System.out.println("formatMoney");
        CandyController instance = new CandyController();
        String expResult = "";
        String result = instance.formatMoney();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of formatChange method, of class CandyController.
     */
    @Test
    public void testFormatChange() {
        System.out.println("formatChange");
        CandyController instance = new CandyController();
        String expResult = "";
        String result = instance.formatChange();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTextFields method, of class CandyController.
     */
    @Test
    public void testSetTextFields() {
        System.out.println("setTextFields");
        CandyController instance = new CandyController();
        instance.setTextFields();
        
    }

    /**
     * Test of vend method, of class CandyController.
     */
    @Test
    public void testVend() {
        System.out.println("vend");
        ActionEvent event = null;
        CandyController instance = new CandyController();
        instance.vend(event);
       
    }

    /**
     * Test of initialize method, of class CandyController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        CandyController instance = new CandyController();
        instance.initialize(url, rb);
       
    }

    /**
     * Test of setScreenParent method, of class CandyController.
     */
    @Test
    public void testSetScreenParent() {
        System.out.println("setScreenParent");
        ScreensController screenParent = null;
        CandyController instance = new CandyController();
        instance.setScreenParent(screenParent);
       
    }
    
}
