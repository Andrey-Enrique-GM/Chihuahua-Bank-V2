/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.chihuahuabank.entities;

import java.util.ArrayList;
import java.util.List;
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
public class InterestCalculatorTest {
    
    public InterestCalculatorTest() {
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
     * Test of generateTransactionsWithInterest method, of class InterestCalculator.
     */
    @Test
    public void testGenerateTransactionsWithInterest() {
        System.out.println("generateTransactionsWithInterest");
        List<Transaction> original = new ArrayList<>(100); 
        double rate = 0.1;
        List<Transaction> expResult = new ArrayList<>(10);
        List<Transaction> result = InterestCalculator.generateTransactionsWithInterest(original, rate);
        assertEquals(expResult, result);
        
    }
    
    
}
