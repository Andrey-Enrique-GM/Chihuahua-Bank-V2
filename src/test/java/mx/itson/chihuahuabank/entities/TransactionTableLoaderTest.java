/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.chihuahuabank.entities;

import java.util.List;
import javax.swing.table.DefaultTableModel;
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
public class TransactionTableLoaderTest {
    
    public TransactionTableLoaderTest() {
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
     * Test of loadTransactionsIntoTable method, of class TransactionTableLoader.
     */
    @Test
    public void testLoadTransactionsIntoTable() {
        System.out.println("loadTransactionsIntoTable");
        DefaultTableModel model = null;
        List<Transaction> transactions = null;
        TransactionTableLoader.loadTransactionsIntoTable(model, transactions);
        
    }
    
}
