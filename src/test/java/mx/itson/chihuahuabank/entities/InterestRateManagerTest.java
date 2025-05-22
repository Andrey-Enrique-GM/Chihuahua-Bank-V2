/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.chihuahuabank.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class InterestRateManagerTest {
    
    public InterestRateManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setDailyInterestRate method, of class InterestRateManager.
     */
    @Test
    public void testSetDailyInterestRate() {
        System.out.println("setDailyInterestRate");
        double rate = 0.0;
        InterestRateManager instance = new InterestRateManager();
        instance.setDailyInterestRate(rate);
        
    }

    /**
     * Test of getDailyInterestRate method, of class InterestRateManager.
     */
    @Test
    public void testGetDailyInterestRate() {
        System.out.println("getDailyInterestRate");
        InterestRateManager instance = new InterestRateManager();
        double expResult = 0.0;
        double result = instance.getDailyInterestRate();
        assertEquals(expResult, result, 0);
     
    }
    
}
